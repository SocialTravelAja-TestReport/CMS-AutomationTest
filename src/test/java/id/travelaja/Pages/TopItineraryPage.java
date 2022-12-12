package id.travelaja.Pages;

import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;

public class TopItineraryPage {

    public static final String TOP_ITINERARY_URL = "https://dev-app.travelaja.id/itinerary";
    public static final By ADD_ITINERARY_BUTTON = By.cssSelector(".mantine-Button-filled");
    public static final By DELETE_ITINERARY_INDEX_1 = By.cssSelector("tr.mantine-1v8421q:nth-child(1) > td:nth-child(5) > button:nth-child(1)");
    public static final By DELETE_ITINERARY_CONFIRMATION_MODAL = By.cssSelector(".mantine-Modal-modal");
    public static final By TOP_ITINERARY_SEARCH_BAR = By.xpath("//*[contains(@id, 'mantine')]");
    public static final By CONFIRM_DELETE_ITINERARY = By.cssSelector("button.mantine-Button-filled:nth-child(2) > div:nth-child(1)");
    public static final By CANCEL_DELETE_ITINERARY = By.cssSelector(".mantine-Button-default > div:nth-child(1)");

    public static String deletedItineraryTitle() {
        return getDriver().findElement(By.cssSelector("tr.mantine-1v8421q:nth-child(1) > td:nth-child(3)")).getText();
    }
}
