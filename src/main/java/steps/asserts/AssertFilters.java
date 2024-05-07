package steps.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertFilters {

    public static void filterIsDisplayed(WebDriver driver, By element) {
        assertThat(driver.findElement(element).isDisplayed(), equalTo(true));
    }

    public static void filterActivated(WebDriver driver, By element, String attribute, String value) {
        assertThat(driver.findElement(element).getAttribute(attribute), containsString(value));
    }
}