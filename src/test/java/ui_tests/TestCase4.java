package ui_tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertFilters;
import steps.asserts.AssertGeneral;

import static steps.GeneralSteps.*;
import static web_elements.FiltersElements.*;
import static web_elements.GeneralElements.catalogButton;
import static web_elements.GeneralElements.firstProductOnHomePage;

public class TestCase4 {

    @Test
    @DisplayName("Работа с фильтрами")
    @Description("Фильтры активируются; выбранные фильтры отображаются на странице каталога; количество товара на " +
            "странице фильтров соответсвует количеству на странице каталога")
    public void filtersTest() {

//      1. Открыть https://www.wildberries.ru/
        openBrowser();

//      2. Нажать "Фильтры"
        waitUntilVisibilityOf(driver, firstProductOnHomePage);

        clickSelect(driver, catalogButton);

//      3. Выбрать фильтр: "Электроника" - "Ноутбуки и компьютеры" - "Ноутбуки"
        moveToElementCatalog(driver, electronicsCatalog);

        clickSelect(driver, laptopsAndPcCatalog);

        clickSelect(driver, laptopsCatalog);

//      Проверка, что открылась страница с ноутбуками
        AssertGeneral.textPresence(driver, laptopsCatalogTitle, "Ноутбуки и ультрабуки");

//      4. Применить фильтры, как показано на скриншотах
        clickSelect(driver, allFilters);

        dataInput(driver, minPrice, "100000");

        dataInput(driver, maxPrice, "149000");

        clickSelect(driver, radioMax3Days);

        clickSelect(driver, brand);

        clickSelect(driver, screen);

//      5. Нажать кнопку "Показать"
        clickSelect(driver, filterResult);

//      Проверка, что выбранные фильтры отображаются на странице
        AssertFilters.filterIsDisplayed(driver, radioMax3DaysOnPage);
        AssertFilters.filterIsDisplayed(driver, priceRangeOnPage);
        AssertFilters.filterIsDisplayed(driver, brandOnPage);
        AssertFilters.filterIsDisplayed(driver, screenOnPage);

//      Проверка, что появилась кнопка "Сбросить все"
        AssertFilters.filterIsDisplayed(driver, resetFilters);

//      Проверка, что кол-во товара на странице фильтров = количеству товара на странице
        clickSelect(driver, allFilters);

        String numberOfProductsFiltersText = getElementText(driver, numberOfProductsFilters);
        String numberOfProductsCatalogText = getElementText(driver, numberOfProductsCatalog);

        AssertGeneral.textMatch(numberOfProductsFiltersText, numberOfProductsCatalogText);

//      Проверка, что фильтр активировался
        AssertFilters.filterActivated(driver, radioMax3DaysActive, "class", "radio-with-text j-list-item selected");
        AssertFilters.filterActivated(driver, brandActive, "class", "checkbox-with-text j-list-item selected");
        AssertFilters.filterActivated(driver, screenActive, "class", "checkbox-with-text j-list-item selected");

        closeBrowser();
    }
}