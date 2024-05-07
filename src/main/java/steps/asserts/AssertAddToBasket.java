package steps.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AssertAddToBasket {

    public static void buttonAvailable(WebDriver driver, By element) {
        assertThat(driver.findElement(element).isEnabled(), equalTo(true));
    }
}
