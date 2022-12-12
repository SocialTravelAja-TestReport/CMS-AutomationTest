package id.travelaja.StepDefs;

import id.travelaja.Interactions.UserInteractions;
import id.travelaja.Questions.VerifyVisibility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static id.travelaja.Pages.AddItineraryPage.ADD_ITINERARY_URL;
import static id.travelaja.Pages.ModalAddItinerary.*;
import static id.travelaja.Pages.TopItineraryPage.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class TopItineraryStepDef extends UserInteractions {

    static String deletedTitle;

    @And("User navigate to Top Itinerary Page")
    public void userNavigateToTopItineraryPage() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().get(TOP_ITINERARY_URL);
        waitingUrlToBe(TOP_ITINERARY_URL);
    }

    @When("User click add itinerary button")
    public void userClickAddItineraryButton() {
        clickOn(ADD_ITINERARY_BUTTON);
    }

    @Then("Add Itinerary modal open")
    public void userIsOnAddItineraryPage() throws InterruptedException {
        Thread.sleep(500);
        VerifyVisibility.ofElement(ADD_ITINERARY_MODAL);
    }

    @When("User click delete itinerary button")
    public void userClickDeleteItineraryButton() {
        clickOn(DELETE_ITINERARY_INDEX_1);
    }

    @Then("Delete itinerary confirmation modal appeared")
    public void deleteItineraryConfirmationModalAppeared() {
        VerifyVisibility.ofElement(DELETE_ITINERARY_CONFIRMATION_MODAL);
    }

    @When("Search Top Itinerary with name {string}")
    public void searchTopItineraryWithName(String parameter) {
        inputTextTo(parameter, TOP_ITINERARY_SEARCH_BAR);
        pressKeysOn(Keys.ENTER, TOP_ITINERARY_SEARCH_BAR);
    }

    @Then("Top Itinerary with name {string} appeared")
    public void topItineraryWithNameAppeared(String parameter) {
        VerifyVisibility.ofTextInDOM(parameter);
    }

    @Then("All Listed column below visible:")
    public void allListedColumnBelowVisible(DataTable column) {
        List<String> columnTitle = column.asList();
        for (String col : columnTitle){
            Assertions.assertTrue(VerifyVisibility.ofTextInDOM(col));
        }
    }

    @When("User click Hapus Button on Top Itinerary Delete Modal")
    public void userClickHapusButtonOnTopItineraryDeleteModal() {
        deletedTitle = deletedItineraryTitle();
        clickOn(CONFIRM_DELETE_ITINERARY);
    }

    @Then("Data removed from top itinerary")
    public void dataRemovedFromTopItinerary() {
        Assertions.assertFalse(VerifyVisibility.ofTextInDOM(deletedTitle));
    }

    @When("User click Batal Button on Top Itinerary Delete Modal")
    public void userClickBatalButtonOnTopItineraryDeleteModal() {
        clickOn(CANCEL_DELETE_ITINERARY);
    }

    @Then("Top Itinerary Delete Modal is closed")
    public void topItineraryDeleteModalIsClosed() {
        VerifyVisibility.elementShouldNotExist(By.cssSelector(".mantine-Modal-modal"));
    }

    @And("User redirected to Top Itinerary Page")
    public void userRedirectedToTopItineraryPage() {
        Assertions.assertEquals(TOP_ITINERARY_URL, getDriver().getCurrentUrl());
    }

    @When("User click add icon on Modal Add Itinerary")
    public void userClickAddIconOnModalAddItinerary() {
        clickOn(ADD_ITINERARY_TO_TOP_ITINERARY_INDEX_1);
    }

    @And("Modal {string} appeared")
    public void modalAppeared(String text) {
        VerifyVisibility.ofTextInDOM(text);
    }

    @Then("Pagination limit is set to {int} row per page")
    public void paginationLimitIsSetToRowPerPage(int limit) {
        WebElement parent = getDriver().findElement(ADD_ITINERARY_MODAL);
        int elementCount = parent.findElements(ITINERARY_LIST_ROW).size();
        Assertions.assertEquals(limit, elementCount);
    }

    @When("User search top itinerary query {string} on Modal Add Itinerary")
    public void userSearchTopItineraryQueryOnModalAddItinerary(String query) {
        WebElement parent = getDriver().findElement(By.cssSelector(".ActionButton-module__filters___L8bKS"));
        parent.findElement(ADD_ITINERARY_SEARCH_BAR).sendKeys(query);
    }

    @Then("Top Itinerary with name {string} appeared in Add Itinerary Modal")
    public void topItineraryWithNameAppearedInAddItineraryModal(String query) {
        WebElement parent = getDriver().findElement(By.cssSelector(".ActionButton-module__modalAdd___tKMzH"));
        Assertions.assertTrue(VerifyVisibility.ofTextInElement(query, parent));
    }

    @Then("All itinerary should by visible in Add Itinerary Modal")
    public void allItineraryShouldByVisibleInAddItineraryModal() {
        WebElement parent = getDriver().findElement(ADD_ITINERARY_MODAL);
        int elementCount = parent.findElements(ITINERARY_LIST_ROW).size();
        Assertions.assertEquals(5, elementCount);
    }
}
