package steps.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AssertGeneral {

    public static void textPresence(WebDriver driver, By element, String expectedResult) {
        assertThat(driver.findElement(element).getText(), equalTo(expectedResult));
    }

    public static void textMatch(String text1, String text2) {
        if (text1.startsWith("/")) {
            text1 = text1.substring(2);
        } else if (text1.startsWith("Нашли")) {
            text1 = text1.substring(6);
        }

        assertThat(text1, equalTo(text2));
    }
}
