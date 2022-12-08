package id.travelaja.Tasks;

import id.travelaja.Interactions.UserInteractions;

import static id.travelaja.Pages.AuthorizationPage.*;

public class Login extends UserInteractions {
    public void with(String username, String password) {
        inputTextTo(username, USERNAME_FIELD);
        inputTextTo(password, PASSWORD_FIELD);
        clickOn(LOGIN_BUTTON);
    }
}
