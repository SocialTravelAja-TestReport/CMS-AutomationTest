package id.travelaja.Questions;

import net.thucydides.core.webdriver.exceptions.ElementNotVisibleAfterTimeoutError;
import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;

public class VerifyVisibility {

    public static boolean ofTextInDOM(String text) throws ElementNotVisibleAfterTimeoutError {
        return getDriver().findElements(By.xpath(".//*[text()[contains(.,'"+ text +"')]]")).size() > 0;
    }

    public static boolean ofElement(By element) throws ElementNotVisibleAfterTimeoutError{
        return getDriver().findElement(element).isDisplayed();
    }

    public static boolean elementShouldNotExist(By element) {
        return getDriver().findElements(element).size() < 1;
    }
}
