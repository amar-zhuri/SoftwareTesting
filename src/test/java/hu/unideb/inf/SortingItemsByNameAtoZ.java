package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SortingItemsByNameAtoZ  extends AbstractStepDefs {



    @Then("the items should be sorted by name in ascending order")
    public void theItemsShouldBeSortedByNameInAscendingOrder() {
        List<WebElement> itemNames = driver.findElements(By.className("inventory_item_name"));
        List<String> actualNames = itemNames.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        List<String> sortedNames = actualNames.stream().sorted().collect(Collectors.toList());
        assertEquals(sortedNames, actualNames, "Items are not sorted by name in ascending order.");
    }
}
