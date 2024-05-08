package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.asserts.AssertFilters;

public class FiltersSteps {

    public static void assertAllFiltersDisplayed(WebDriver driver, By... elements) {
        for (By element : elements) {
            AssertFilters.filterIsDisplayed(driver, element);
        }
    }
}
