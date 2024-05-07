package ui_tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertChangeCity;
import steps.asserts.AssertGeneral;

import static steps.GeneralSteps.*;
import static web_elements.ChangeCityElements.*;

public class TestCase2 {

    @Test
    @DisplayName("Смена города")
    @Description("Осуществляются переходы на страницы пункта выдачи и на главную страницу WB, адреса совпадают")
    public void changeCityTest() {

//      1. Открыть https://www.wildberries.ru/
        openBrowser();

//      2. Кликнуть на кнопку "Смена города"
        clickSelect(driver, addressButton);

//      3. В поисковую строку ввести "Санкт-Петербург"
        String city = "Санкт-Петербург";

        dataInput(driver, addressInput, city);

//      4. Выбрать первый адрес из списка адресов
        String firstAddressText = getElementText(driver, firstAddress);

        clickSelect(driver, firstAddress);

//      Проверка, что открылась информация о центре выдачи
        AssertChangeCity.passToPickPointPage(driver, listOfPickPointsPage, selectedPickPointPage);

        String addressSelectedPickPointText = getElementText(driver, addressSelectedPickPoint);

//      Проверка, что адрес пункта выдачи совпадает с тем адресом, что был предложен в списке адресов
        AssertGeneral.textMatch(firstAddressText, addressSelectedPickPointText);

//      5. Нажать на кнопку "Выбрать"
        clickSelect(driver, selectButton);

//      Проверка, что произошел переход на главную страницу WB
        String wbUrl = "https://www.wildberries.ru/";
        String attribute = "href";

        AssertChangeCity.passToHomePage(driver, homePageUrl, attribute, wbUrl);

//      Проверка, что отображается адрес пункта выдачи из предыдущего шага
        String addressOnHomePageText = getElementText(driver, addressOnHomePage);

        AssertGeneral.textMatch(addressSelectedPickPointText, addressOnHomePageText);

        closeBrowser();
    }
}
