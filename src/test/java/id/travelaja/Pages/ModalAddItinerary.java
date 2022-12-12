package id.travelaja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModalAddItinerary {

    public static final By ADD_ITINERARY_TO_TOP_ITINERARY_INDEX_1 = By.cssSelector(".ActionButton-module__tableBody___REp-B > tr:nth-child(1) > td:nth-child(3) > button:nth-child(1)");
    public static final By ITINERARY_LIST_ROW = By.xpath("//td[contains(text(), 'Itinerary')]");
    public static final By ADD_ITINERARY_MODAL = By.xpath("//*[contains(@id, 'mantine')]");
    public static final By ADD_ITINERARY_SEARCH_BAR = By.xpath("//*[contains(@id, 'mantine')]");
}
