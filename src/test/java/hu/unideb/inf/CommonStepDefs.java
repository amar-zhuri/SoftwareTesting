package hu.unideb.inf;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @When("the 'Filter' dropdown is selected with {string}")//Un e kom shty
    public void theFilterDropdownIsSelectedWith(String filterOption) {
        homePage.selectFilterOption(filterOption);
    }

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }

}
