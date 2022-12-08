package id.travelaja.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class UserInteractions {

    public void waitingVisibilityOfElement(By element){
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void inputTextTo(String text, By element){
        waitingVisibilityOfElement(element);
        getDriver().findElement(element).click();
        getDriver().findElement(element).clear();
        getDriver().findElement(element).sendKeys(text);
    }

    public void clickOn(By element){
        waitingVisibilityOfElement(element);
        getDriver().findElement(element).click();
    }

    public void waitingUrlToBe(String URL){
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.urlToBe(URL));
    }

    public void pressKeysOn(Keys keys, By element){
        getDriver().findElement(element).sendKeys(keys);
    }

    public void isElementDisplayed(By element){
        waitingVisibilityOfElement(element);
        getDriver().findElement(element).isDisplayed();
    }

    public void scrollIntoView(By element){
        WebElement webElement = getDriver().findElement(element);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void isElementClickable(WebElement element){
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getElementText(By element){
        return getDriver().findElement(element).getText();
    }
}
