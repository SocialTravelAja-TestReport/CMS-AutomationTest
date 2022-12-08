package id.travelaja.Pages;

import org.openqa.selenium.By;

public class UserManagementPage {

    public static final String USER_MANAGEMENT_URL = "https://dev-app.travelaja.id/user";
    public static final By USER_MANAGEMENT_MODAL = By.cssSelector(".UserModule-module__user-module___2i88D");
    public static final By SEARCH_BAR_FIELD = By.xpath("//*[starts-with(@id,'mantine')]");
}
