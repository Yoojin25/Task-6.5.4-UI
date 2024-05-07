package web_elements;

import org.openqa.selenium.By;

public class AddToBasketElements {
    public static By appliancesCatalog = By.xpath("//a[contains(@class, '16107')]");
    public static By homeAppliancesCatalog = By.xpath("//span[contains(text(), 'Техника для дома')]");
    public static By cleanersCatalog = By.xpath("//span[contains(text(), 'Пылесосы и пароочистители')]");
    public static By cleanersCatalogNext = By.xpath("//a[contains(@class, 'j-menu-drop-link') and contains(text(), 'Пылесосы и пароочистители')]");
    public static By cleanersCatalogTitle = By.xpath("//h1[@class='catalog-title']");
    public static By filterPath = By.xpath("//div[@class='breadcrumbs__container']");
    public static By addToBasketButton = By.xpath("//article[1]//a[@href='/lk/basket']");
    public static By cookiesButton = By.xpath("//button[@class='cookies__btn btn-minor-md']");
    public static By productPriceOnPage = By.xpath("//article[1]//ins");
    public static By productNameOnPage = By.xpath("//article[1]//span[@class='product-card__name']");
    public static By counterOfBasket = By.xpath("//span[@class='navbar-pc__notify']");
    public static By basketButton = By.xpath("//span[contains(@class, 'navbar-pc__icon--basket')]");
    public static By chatButton = By.xpath("//button[contains(@class, 'btn-chat')]");
    public static By productPriceInBasket = By.xpath("//div[contains(@data-link, 'priceSumWith')]");
    public static By productNameInBasket = By.xpath("//span[@class='good-info__good-name']");
    public static By priceAllProducts = By.xpath("//span[@class='b-right']");
    public static By totalPrice = By.xpath("//span[contains(@data-link, 'totalPaymentFee')]");
    public static By orderButton = By.xpath("//button[@name='ConfirmOrderByRegisteredUser']");
}