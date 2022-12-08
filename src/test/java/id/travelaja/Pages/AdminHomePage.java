package id.travelaja.Pages;

import org.openqa.selenium.By;

import static id.travelaja.Model.EnvironmentVariable.BASE_URL;

public class AdminHomePage {

    public static final String ADMIN_HOME_URL = BASE_URL + "/home";
    public static final By ADMIN_USER_NAV_BAR = By.linkText("User");
    public static final By ADMIN_ROLE_NAV_BAR = By.linkText("Role");
}
