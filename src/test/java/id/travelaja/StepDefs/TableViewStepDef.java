package id.travelaja.StepDefs;

import id.travelaja.Interactions.UserInteractions;
import id.travelaja.Questions.VerifyVisibility;
import id.travelaja.Tasks.AdminNavigate;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.awt.*;
import java.util.List;

import static id.travelaja.Pages.AdminHomePage.ADMIN_HOME_URL;
import static id.travelaja.Pages.AdminHomePage.ADMIN_USER_NAV_BAR;
import static id.travelaja.Pages.UserManagementPage.USER_MANAGEMENT_URL;
import static net.serenitybdd.core.Serenity.getDriver;

public class TableViewStepDef extends UserInteractions {

    @And("User navigate to User Management Page")
    public void userIsOnUserManagementPage() throws AWTException {
        waitingUrlToBe(ADMIN_HOME_URL);
        AdminNavigate.to(USER_MANAGEMENT_URL);
    }

    @When("Admin is on User Management Page")
    public void adminIsOnUserManagementPage() {
        //failsafe
        waitingUrlToBe(USER_MANAGEMENT_URL);
        Assertions.assertEquals(USER_MANAGEMENT_URL, getDriver().getCurrentUrl());
    }

    @Then("Admin can see following column")
    public void adminCanSeeFollowingColumn(DataTable column) {
        List<String> columnTitle = column.asList();
        for (String col : columnTitle){
            Assertions.assertTrue(VerifyVisibility.ofTextInDOM(col));
        }
    }

    @Then("Data is sorted ascending by default")
    public void dataIsSortedAscendingByDefault() {
    }

    @Then("Data is limited by {int} by default")
    public void dataIsLimitedByByDefault(int limit) {
        Assertions.assertTrue(VerifyVisibility.elementShouldNotExist(By.cssSelector("tr:nth-child("+ (limit+1) +") > td:nth-child(1)")));
    }
}
