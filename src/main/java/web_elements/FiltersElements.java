package web_elements;

import org.openqa.selenium.By;

public class FiltersElements {
    public static By electronicsCatalog = By.xpath("//a[contains(@class, '4830')]");
    public static By laptopsAndPcCatalog = By.xpath("//span[contains(text(), 'Ноутбуки и компьютеры')]");
    public static By laptopsCatalog = By.xpath("//a[contains(@class, 'menu-burger__link') and text()='Ноутбуки']");
    public static By laptopsCatalogTitle = By.xpath("//h1[@class='catalog-title']");
    public static By allFilters = By.xpath("//button[contains(@class, 'dropdown-filter__btn--all')]");
    public static By minPrice = By.xpath("//input[@name='startN']");
    public static By maxPrice = By.xpath("//input[@name='endN']");
    public static By radioMax3Days = By.xpath("//span[@class='radio-with-text__text' and text()='до 3 дней']");
    public static By brand = By.xpath("//span[text()='Apple']");
    public static By screen = By.xpath("//span[text()='13.3\"']");
    public static By filterResult = By.xpath("//button[@class='filters-desktop__btn-main btn-main']");
    public static By radioMax3DaysOnPage = By.xpath("//span[@class='your-choice__btn' and text()='до 3 дней']");
    public static By priceRangeOnPage = By.xpath("//span[@class='your-choice__btn' and text()='от 100 000 до 149 000']");
    public static By brandOnPage = By.xpath("//span[@class='your-choice__btn' and text()='Apple']");
    public static By screenOnPage = By.xpath("//span[@class='your-choice__btn' and text()='13.3\"']");
    public static By resetFilters = By.xpath("//button[@data-link='{on resetAllFiltres}']");
    public static By numberOfProductsFilters = By.xpath("//p[@class='filters-desktop__count-goods']");
    public static By numberOfProductsCatalog = By.xpath("//span[@class='goods-count']");
    public static By radioMax3DaysActive = By.xpath("//span[@class='radio-with-text__text' and text()='до 3 дней']/..");
    public static By brandActive = By.xpath("//span[@class='checkbox-with-text__text' and text()='Apple']/..");
    public static By screenActive = By.xpath("//span[@class='checkbox-with-text__text' and text()='13.3\"']/..");
}
