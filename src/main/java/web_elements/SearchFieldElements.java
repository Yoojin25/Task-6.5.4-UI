package web_elements;

import org.openqa.selenium.By;

public class SearchFieldElements {
    public static By searchField = By.xpath("//input[@id='searchInput']");
    public static By searchingResult = By.xpath("//h1");
    public static By filterFirst = By.xpath("//button[contains(@class, 'btn--burger')]");
    public static By filterByPopularity = By.xpath("//button[contains(@class, 'btn--sorter')]");
    public static By firstProductBrand = By.xpath("//article[1]//span[@class='product-card__brand']");
    public static By clearButton = By.xpath("//button[contains(@class, 'btn--clear')]");
}