package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemUserCannotSelectSorting {
    @Then("the sorting dropdown should still show {string}")
    public void theSortingDropdownShouldStillShow(String expectedSortingOption) {
        String actualSortingOption = homePage.getSelectedSortingOption();
        assertEquals(expectedSortingOption, actualSortingOption);
    }

    @When("the sorting option is changed to {string}")
    public void theSortingOptionIsChangedTo(String newSortingOption) {
        homePage.selectFilterOption(newSortingOption);
    }
}
