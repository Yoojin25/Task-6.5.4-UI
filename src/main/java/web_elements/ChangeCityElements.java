package web_elements;

import org.openqa.selenium.By;

public class ChangeCityElements {
    public static By addressButton = By.xpath("//span[contains(@class, 'j-geocity-link')]");
    public static By addressInput = By.xpath("//input[contains(@class, 'ymaps')]");
    public static By firstAddress = By.xpath("(//span[@class='address-item__name-text'])[1]");
    public static By listOfPickPointsPage = By.xpath("//div[@class='geo-block__info']");
    public static By selectedPickPointPage = By.xpath("//div[@class='details-self']");
    public static By addressSelectedPickPoint = By.xpath("//span[@class='details-self__name-text']");
    public static By selectButton = By.xpath("//button[@class='details-self__btn btn-main']");
    public static By homePageUrl = By.xpath("//base");
    public static By addressOnHomePage = By.xpath("//span[@data-wba-header-name='DLV_Adress']");
}