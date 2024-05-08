package ui_tests;

import base.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertGeneral;
import steps.asserts.AssertSearchField;

import static steps.GeneralSteps.*;
import static web_elements.SearchFieldElements.*;

public class SearchFieldTest extends BaseTest {

    @Test
    @DisplayName("Работа с поисковой строкой")
    @Description("Текст 'Iphone 13' присутствует; первый фильтр пустой; применен фильтр 'По популярности'; у первого " +
            "устройства из списка бренд - Apple")
    public void searchFieldTest() {

//      2. Нажать на поисковую строку
//      3. Ввести "Iphone 13"
//      4. Нажать Enter
        String product = "Iphone 13";

        dataInput(driver, searchField, product);

//      Проверить что присутствует текст "По запросу Iphone 13 найдено"
        AssertGeneral.textPresence(driver, searchingResult, product);

//      Проверить что первый фильтр - iphone 13 (там теперь пусто)
        AssertSearchField.emptyElement(driver, filterFirst);

//      Проверить что применен фильтр "По популярности"
        AssertGeneral.textPresence(driver, filterByPopularity, "По популярности");

//      Проверить что у первого устройства из списка бренд - Apple
        AssertGeneral.textPresence(driver, firstProductBrand, "Apple");

//      5. Нажать на крестик
        clickSelect(driver, clearButton);

//      Проверить, что строка стала пустой
        AssertSearchField.emptyElement(driver, searchField);
    }
}