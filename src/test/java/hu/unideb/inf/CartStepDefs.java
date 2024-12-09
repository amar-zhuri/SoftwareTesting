package hu.unideb.inf;

import io.cucumber.java.en.Then;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartStepDefs extends AbstractStepDefs {

    @Then("the cart total should match the sum of item prices")
    public void theCartTotalShouldMatchTheSumOfItemPrices() {
        double subtotal = homePage.getDisplayedSubtotal();
        double tax = homePage.getDisplayedTax();
        double displayedTotal = homePage.getDisplayedTotal();

        assertEquals(subtotal + tax, displayedTotal);
    }

}
