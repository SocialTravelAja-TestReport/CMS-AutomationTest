package id.travelaja.StepDefs;

import id.travelaja.Interactions.UserInteractions;
import id.travelaja.Model.Role;
import id.travelaja.Pages.AuthorizationPage;
import id.travelaja.Pages.RoleManagementPage;
import id.travelaja.Questions.VerifyVisibility;
import id.travelaja.Tasks.AdminNavigate;
import id.travelaja.Tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static id.travelaja.Pages.AdminHomePage.ADMIN_HOME_URL;
import static id.travelaja.Pages.AdminHomePage.ADMIN_ROLE_NAV_BAR;
import static id.travelaja.Pages.EditRolePage.EDIT_ROLE_FIELD;
import static id.travelaja.Pages.EditRolePage.MESSAGE_SUCCESS_EDIT_PRIVILEDGE;
import static id.travelaja.Pages.LihatRolePage.DETAIL_ROLE_FIELD;
import static id.travelaja.Pages.RoleManagementPage.*;
import static id.travelaja.Pages.TambahRolePage.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class RoleStepDef extends UserInteractions {

    Login login = new Login();

    private static final String CRUD_ROLE_TITLE = "ToBeDeleted";
    private static String RANDOM_ROLE_TITLE;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        getDriver().get(AuthorizationPage.LOGIN_URL);
    }

    @When("User go to role management page by url")
    public void userGoToRoleManagementPageByUrl() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().get(RoleManagementPage.ROLE_MANAGEMENT_URL);
    }

    @Then("User is redirected to login page")
    public void userIsRedirectedToLoginPage() {
        Assertions.assertEquals(AuthorizationPage.LOGIN_URL, getDriver().getCurrentUrl());
    }

    @Then("User is on Role Management page")
    public void userIsOnRoleManagementPage() throws InterruptedException {
        Thread.sleep(1500);
        Assertions.assertEquals(RoleManagementPage.ROLE_MANAGEMENT_URL, getDriver().getCurrentUrl());
    }

    @Given("User already login as Unauthorized User")
    public void userAlreadyLoginAsUnauthorizedUser() {
        getDriver().get(AuthorizationPage.LOGIN_URL);
        login.with(Role.UNAUTHORIZED_USERNAME, Role.UNAUTHORIZED_PASSWORD);
    }

    @When("User navigate to Role Management Page")
    public void userNavigateToRoleManagementPage() throws AWTException {
        waitingUrlToBe(ADMIN_HOME_URL);
        AdminNavigate.to(ROLE_MANAGEMENT_URL);
    }

    @When("User click detailed role information")
    public void userClickDetailedRoleInformation() {
        clickOn(DETAIL_FIRST_ROLE);
    }

    @Then("Detailed role information shown")
    public void detailedRoleInformationShown() {
        isElementDisplayed(DETAIL_ROLE_FIELD);
    }

    @When("User click edit role button")
    public void userClickEditRoleButton() {
        clickOn(EDIT_FIRST_ROLE);
    }

    @Then("Modal edit Role Page shown")
    public void modalEditRolePageShown() {
        isElementDisplayed(EDIT_ROLE_FIELD);
    }

    @Given("User create new role with blank Nama Role")
    public void userCreateNewRoleWithBlankNamaRole() {
        getDriver().get(TAMBAH_ROLE_URL);
    }

    @And("User create role with some privilege")
    public void userCreateRoleWithSomePrivilege() throws InterruptedException {
        clickOn(TAMBAH_ROLE_PRIVILEGE_MAIN_MENU);
        Thread.sleep(2000);
    }

    @Given("User delete a role")
    public void userDeleteARole() {
        clickOn(DELETE_FIRST_ROLE);
    }

    @And("Delete confirmation modal appear")
    public void deleteConfirmationModalAppear() {
        isElementDisplayed(DELETE_CONFIRMATION_MODAL);
    }

    @When("User click confirm delete a role")
    public void userClickConfirmDeleteARole() {
        clickOn(CONFIRM_DELETE_ROLE_BUTTON);
    }

    @Then("Data deleted")
    public void dataDeleted() {
        Assertions.assertFalse(VerifyVisibility.ofTextInDOM("ToBeDeletedRole"));
    }

    @Given("User create new role with some privilege")
    public void userCreateNewRoleWithSomePrivilege() {
        getDriver().get(TAMBAH_ROLE_URL);
        inputTextTo(CRUD_ROLE_TITLE, TAMBAH_ROLE_TITLE);
        clickOn(TAMBAH_ROLE_PRIVILEGE_MAIN_MENU);
    }

    @When("User click Simpan button")
    public void userClickSimpanButton() throws InterruptedException {
        scrollIntoView(TAMBAH_ROLE_SIMPAN_BUTTON);
        clickOn(TAMBAH_ROLE_SIMPAN_BUTTON);
        Thread.sleep(2000);
    }

    @Then("Data is saved")
    public void dataIsSaved() {
        VerifyVisibility.ofTextInDOM(CRUD_ROLE_TITLE);
    }

    @And("User redirected to Role Management Page")
    public void userRedirectedToRoleManagementPage() {
        Assertions.assertEquals(ROLE_MANAGEMENT_URL, getDriver().getCurrentUrl());
    }

    @When("User search by {} {string}")
    public void userSearchByNamaRole(String key, String parameter) {
        inputTextTo(parameter, ROLE_MANAGEMENT_SEARCH_BAR);
    }


    @Then("Role with {} {string} appeared")
    public void roleWithNamaRoleAppeared(String key, String parameter) {
        VerifyVisibility.ofTextInDOM(parameter);
    }

    @When("User search by null value")
    public void userSearchByNullValue() {
        inputTextTo("", ROLE_MANAGEMENT_SEARCH_BAR);
    }

    @Then("All role displayed")
    public void allRoleDisplayed() {
        //TODO create assertions script findelements()
        Assertions.assertTrue(getDriver().findElements(By.className("ListRole-module__fiturRow___pXOxL")).size() > 1);
    }

    @When("User click Simpan button {int} times")
    public void userClickSimpanButtonMultipleTimes(int clickCount) throws InterruptedException {
        scrollIntoView(TAMBAH_ROLE_SIMPAN_BUTTON);

        for(int i = 0; i < clickCount; i++){
            clickOn(TAMBAH_ROLE_SIMPAN_BUTTON);
        }
        Thread.sleep(2000);
    }

    @Then("Only one data is saved")
    public void onlyOneDataIsSaved() {
        VerifyVisibility.ofTextInDOM(RANDOM_ROLE_TITLE);
    }

    @Given("User create new role with random name")
    public void userCreateNewRoleWithRandomName() {
        RANDOM_ROLE_TITLE = "TestRole" + String.valueOf(ThreadLocalRandom.current().nextInt(100, 999));
        getDriver().get(TAMBAH_ROLE_URL);
        inputTextTo(RANDOM_ROLE_TITLE, TAMBAH_ROLE_TITLE);
        clickOn(TAMBAH_ROLE_PRIVILEGE_MAIN_MENU);
    }

    @When("User click Tambah Role Button")
    public void userClickTambahRoleButton() {
        clickOn(ADD_NEW_ROLE_BUTTON);
    }

    @Then("Tambah Role Page appeared")
    public void tambahRolePageAppeared() {
        Assertions.assertEquals(TAMBAH_ROLE_URL, getDriver().getCurrentUrl());
    }

    @When("User go to Tambah Role page by URL")
    public void userGoToTambahRolePageByURL() {
        getDriver().get(TAMBAH_ROLE_URL);
    }

    @Then("Element listed below appeared")
    public void elementListedBelowAppeared(DataTable column) {
        List<String> columnTitle = column.asList();
        for (String col : columnTitle){
            Assertions.assertTrue(VerifyVisibility.ofTextInDOM(col));
        }
    }

    @Then("There is asterix in Tambah Role Field title")
    public void thereIsAsterixInTambahRoleFieldTitle() {
        /* 1. get text element
           2. assert contains
           3. Assertions True
         */

        String textOfElement = getElementText(NAMA_ROLE_FIELD_TITLE);
        System.out.println(textOfElement);
        Assertions.assertTrue(textOfElement.contains("*"));
    }

    @And("User click Cancel button")
    public void userClickCancelButton() {
        scrollIntoView(TAMBAH_ROLE_CANCEL_BUTTON);
        clickOn(TAMBAH_ROLE_CANCEL_BUTTON);
    }

    @When("User edit role with some privilege")
    public void userEditRoleWithSomePrivilege() {
        clickOn(TAMBAH_ROLE_PRIVILEGE_MAIN_MENU);
    }

    @Then("Modal success update privilege appeared")
    public void modalSuccessUpdatePrivilegeAppeared() {
        Assertions.assertTrue(getDriver().findElement(MESSAGE_SUCCESS_EDIT_PRIVILEDGE).getText().contains("main-menu"));
    }
}
