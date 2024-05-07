package steps.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertChangeCity {

    public static void passToPickPointPage(WebDriver driver, By listElement, By selectedElement) {
        assertThat(driver.findElement(selectedElement), not(equalTo(driver.findElement(listElement))));
    }

    public static void passToHomePage(WebDriver driver, By element, String attribute, String wbUrl) {
        assertThat(driver.findElement(element).getAttribute(attribute), equalTo(wbUrl));
    }
}