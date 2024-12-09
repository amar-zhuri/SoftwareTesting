package hu.unideb.inf;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortItemsByNameStepDefsZtoA extends AbstractStepDefs {

  /*  @When("the 'Filter' dropdown is selected with {string}")
    public void theFilterDropdownIsSelectedWith(String filterOption) {
        homePage.selectFilterOption(filterOption);
    }*/

    @Then("the items should be sorted by name in descending order")
    public void theItemsShouldBeSortedByNameInDescendingOrder() {
        List<WebElement> itemNames = driver.findElements(By.className("inventory_item_name"));
        List<String> actualNames = itemNames.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        List<String> sortedNames = actualNames.stream()
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .collect(Collectors.toList());
        assertEquals(sortedNames, actualNames);
    }
}
