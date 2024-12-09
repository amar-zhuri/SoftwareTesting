package hu.unideb.inf;

import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutValidationStepDefs extends AbstractStepDefs {

    @Then("the error message {string} should be displayed")
    public void theErrorMessageShouldBeDisplayed(String expectedErrorMessage) {
        String actualErrorMessage = homePage.getExpected();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
