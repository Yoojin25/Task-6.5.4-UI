package ui_tests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertAddToBasket;
import steps.asserts.AssertGeneral;

import static steps.GeneralSteps.*;
import static web_elements.AddToBasketElements.*;
import static web_elements.GeneralElements.catalogButton;
import static web_elements.GeneralElements.firstProductOnHomePage;

public class TestCase3 {

    @Test
    @DisplayName("Добавление товара в корзину")
    @Description("Осуществляется переход на страницу с бытовой техникой; товар добавляется в корзину; название и цена " +
            "товара в корзине соответствуют названию и цене на странице каталога")
    public void addToBasketTest() {

//      1. Открыть https://www.wildberries.ru/
        openBrowser();

//      2. Нажать "Фильтры"
        waitUntilVisibilityOf(driver, firstProductOnHomePage);

        clickSelect(driver, catalogButton);

//      3. Выбрать "Бытовая техника" - "Техника для дома" - "Пылесосы и пароочистители"
        moveToElementCatalog(driver, appliancesCatalog);

        clickSelect(driver, homeAppliancesCatalog);

        clickSelect(driver, cleanersCatalog);

        clickSelect(driver, cleanersCatalogNext);

//      Проверка, что отображается "Пылесосы и пароочистители"
        AssertGeneral.textPresence(driver, cleanersCatalogTitle, "Пылесосы и пароочистители");

//      Проверка, что путь фильтра: "Главная" - "Бытовая техника" - "Техника для дома" - "Пылесосы и пароочистители"
        AssertGeneral.textPresence(driver, filterPath, "Главная\nБытовая техника\nТехника для дома\nПылесосы и пароочистители");

//      4. Нажать на кнопку “В корзину”
        clickSelect(driver, cookiesButton);

        clickSelect(driver, addToBasketButton);

        String productNameOnPageText = getElementText(driver, productNameOnPage);
        String productPriceOnPageText = getElementText(driver, productPriceOnPage);

//      Проверка, что в правом верхнем углу над логотипом "Корзина" появилась красная цифра “1”
        AssertGeneral.textPresence(driver, counterOfBasket, "1");

//      5. Нажать на "Корзина"
        clickSelect(driver, basketButton);

//      Проверка, что текст и цена товара соответствует цене и названию товара из предыдущих шагов
        waitUntilVisibilityOf(driver, chatButton);

        String productNameInBasketText = getElementText(driver, productNameInBasket);
        String productPriceInBasketText = getElementText(driver, productPriceInBasket);

        AssertGeneral.textMatch(productNameOnPageText, productNameInBasketText);
        AssertGeneral.textMatch(productPriceOnPageText, productPriceInBasketText);

//      Проверка, что "Итого" = сумме товара
        String priceAllProductsText = getElementText(driver, priceAllProducts);
        String totalPriceText = getElementText(driver, totalPrice);

        AssertGeneral.textMatch(priceAllProductsText, totalPriceText);

//      Проверка, что кнопка "Заказать" активна для нажатия
        AssertAddToBasket.buttonAvailable(driver, orderButton);

        closeBrowser();
    }
}
