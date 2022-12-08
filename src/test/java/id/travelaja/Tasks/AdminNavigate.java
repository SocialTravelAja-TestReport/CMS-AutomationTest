package id.travelaja.Tasks;

import id.travelaja.Interactions.UserInteractions;
import org.openqa.selenium.By;

import java.awt.*;

import static net.serenitybdd.core.Serenity.getDriver;

public class AdminNavigate extends UserInteractions {

    public static void to(String URL) throws AWTException {
        getDriver().get(URL);
    }
}
