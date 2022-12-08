package id.travelaja.StepDefs;

import id.travelaja.Interactions.UserInteractions;
import id.travelaja.Pages.AdminHomePage;
import id.travelaja.Tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.SkipStepException;
import org.junit.jupiter.api.Assertions;

import static id.travelaja.Pages.AdminHomePage.ADMIN_HOME_URL;
import static id.travelaja.Pages.AuthorizationPage.LOGIN_URL;
import static net.serenitybdd.core.Serenity.getDriver;

public class LoginStepDef extends UserInteractions {

    Login login = new Login();

    @Given("User already login as Admin")
    public void userAlreadyLoginAsAdmin() throws SkipStepException {
        getDriver().get(LOGIN_URL);
        login.with("benson@yopmail.com", "Keon!123");
    }

}
