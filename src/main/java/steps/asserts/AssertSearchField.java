package steps.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertSearchField {

    public static void emptyElement(WebDriver driver, By element) {
        assertThat(driver.findElement(element).getText(), isEmptyString());
    }
}