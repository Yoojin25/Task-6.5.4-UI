package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeneralSteps {

    public static WebDriverWait setWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void clickSelect(WebDriver driver, By element) {
        WebDriverWait wait = setWait(driver);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        driver.findElement(element).click();
    }

    public static String getElementText(WebDriver driver, By element) {
        WebDriverWait wait = setWait(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

        return driver.findElement(element).getText();
    }

    public static void waitUntilVisibilityOf(WebDriver driver, By element) {
        WebDriverWait wait = setWait(driver);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public static void waitTextToBePresentInElement(WebDriver driver, By element, String text) {
        WebDriverWait wait = setWait(driver);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(element), text));
    }

    public static void moveToElementCatalog(WebDriver driver, By element) {
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(element))
                .perform();
    }

    public static void dataInput(WebDriver driver, By element, String data) {
        driver.findElement(element).clear();

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(element))
                .click()
                .sendKeys(data, Keys.ENTER)
                .perform();
    }
}