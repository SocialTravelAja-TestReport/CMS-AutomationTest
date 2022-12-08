package id.travelaja.Pages;

import org.openqa.selenium.By;

import static id.travelaja.Model.EnvironmentVariable.BASE_URL;

public class AuthorizationPage {
    public static final String LOGIN_URL = BASE_URL + "/login";
    public static final By USERNAME_FIELD = By.id("user");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.cssSelector(".LoginForm-module__loginButton___cY8V9");
}
