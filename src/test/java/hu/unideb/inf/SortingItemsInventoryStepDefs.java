package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingItemsInventoryStepDefs extends AbstractStepDefs {

   /* @When("the 'Filter' dropdown is selected with {string}")
    public void theFilterDropdownIsSelectedWith(String filterOption) {
        homePage.selectFilterOption(filterOption);
    }*/

    @Then("the items should be sorted by price in ascending order")
    public void theItemsShouldBeSortedByPriceInAscendingOrder() {
        List<Double> prices = homePage.getItemPrices();
        for (int i = 0; i < prices.size() - 1; i++) {
            assertTrue(prices.get(i) <= prices.get(i + 1));
        }
    }

    @Then("the items should be sorted by price in descending order")
    public void theItemsShouldBeSortedByPriceInDescendingOrder() {
        List<Double> prices = homePage.getItemPrices();
        for (int i = 0; i < prices.size() - 1; i++) {
            assertTrue(prices.get(i) >= prices.get(i + 1), "Items are not sorted by price (high to low)");
        }
    }

}
