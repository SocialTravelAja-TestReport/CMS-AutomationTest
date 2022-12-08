package id.travelaja.StepDefs;

import id.travelaja.Interactions.UserInteractions;
import id.travelaja.Questions.VerifyVisibility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static id.travelaja.Pages.UserManagementPage.*;

public class SearchBarStepDef extends UserInteractions {
    @When("Admin Search by {} {string}")
    public void searchByParams(String key, String value) {
        clickOn(SEARCH_BAR_FIELD);
        inputTextTo(value, SEARCH_BAR_FIELD);
        pressKeysOn(Keys.ENTER, SEARCH_BAR_FIELD);
    }

    @Then("User with {} {string} appeared")
    public void userWithNameAppeared(String key, String value) {
        VerifyVisibility.ofTextInDOM(value);
    }

    @When("Admin Search with invalid data")
    public void adminSearchWithInvalidData() {
        clickOn(SEARCH_BAR_FIELD);
        inputTextTo("яго тестер", SEARCH_BAR_FIELD);
        pressKeysOn(Keys.ENTER, SEARCH_BAR_FIELD);
    }

    @Then("There is no result")
    public void thereIsNoResult() {
        Assertions.assertTrue(VerifyVisibility.elementShouldNotExist(By.xpath("//.[text()[contains(.,'яго тестер')]]")));//*[text()[contains(.,'"+ text +"')]]
    }
}
