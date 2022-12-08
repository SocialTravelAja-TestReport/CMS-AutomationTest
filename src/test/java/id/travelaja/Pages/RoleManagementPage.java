package id.travelaja.Pages;

import org.openqa.selenium.By;

public class RoleManagementPage {

    public static final String ROLE_MANAGEMENT_URL = "https://dev-app.travelaja.id/role";
    public static final By DETAIL_FIRST_ROLE = By.cssSelector("tr:nth-child(1) img:nth-child(2)");
    public static final By EDIT_FIRST_ROLE = By.cssSelector("tr:nth-child(1) img:nth-child(1)");
    public static final By DELETE_FIRST_ROLE = By.cssSelector("tr:nth-child(1) img:nth-child(3)");
    public static final By DELETE_CONFIRMATION_MODAL = By.cssSelector(".mantine-Paper-root");
    public static final By CONFIRM_DELETE_ROLE_BUTTON = By.cssSelector(".ListRole-module__deleteRoleButton___xj9uV");
    public static final By ROLE_MANAGEMENT_SEARCH_BAR = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div/div/input");

    public static final By ADD_NEW_ROLE_BUTTON = By.cssSelector(".FilterRole-module__addRole___2ubu7");

}
