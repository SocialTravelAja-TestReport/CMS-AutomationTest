package id.travelaja.Pages;

import org.openqa.selenium.By;

public class TambahRolePage {

    public static final String TAMBAH_ROLE_URL = "https://dev-app.travelaja.id/tambah-role";
    public static final By TAMBAH_ROLE_TITLE = By.name("title");
    public static final By TAMBAH_ROLE_PRIVILEGE_MAIN_MENU = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/div[2]/table/tbody/tr/td[2]/div/div/input");
    public static final By TAMBAH_ROLE_SIMPAN_BUTTON = By.cssSelector(".mantine-Button-filled > .mantine-3xbgk5");
    public static final By NAMA_ROLE_FIELD_TITLE = By.cssSelector(".Input-module__container___wVgCt");
    public static final By TAMBAH_ROLE_CANCEL_BUTTON = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/form/div[4]/button/div");
}
