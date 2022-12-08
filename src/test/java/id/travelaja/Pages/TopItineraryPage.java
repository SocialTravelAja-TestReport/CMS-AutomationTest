package id.travelaja.Pages;

import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;

public class TopItineraryPage {

    public static final String TOP_ITINERARY_URL = "https://dev-app.travelaja.id/itinerary";
    public static final By ADD_ITINERARY_BUTTON = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/button[2]/div/span");
    public static final By DELETE_FIRST_ITINERARY = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/table/tbody/tr/td[3]/button");
    public static final By DELETE_ITINERARY_CONFIRMATION_MODAL = By.cssSelector(".mantine-Modal-modal");
    public static final By TOP_ITINERARY_SEARCH_BAR = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/input");
    public static final By CONFIRM_DELETE_ITINERARY = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div[2]/button[2]/div");

    public static String deletedItineraryTitle() {
        return getDriver().findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/table/tbody/tr/td[2]")).getText();
    }
}
