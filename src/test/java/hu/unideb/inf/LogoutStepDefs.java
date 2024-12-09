package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoutStepDefs extends AbstractStepDefs {


    @Then("the user should be redirected to the login page")
    public void theUserShouldBeRedirectedToTheLoginPage() {
        assertTrue(homePage.isLoginPageDisplayed());
    }
}
