package web_elements;

import org.openqa.selenium.By;

public class GeneralElements {
    public static By firstProductOnHomePage = By.xpath("//div[@class='main-page__content']//article[1]");
    public static By catalogButton = By.xpath("//button[contains(@class, 'j-menu-burger-btn')]");
}
