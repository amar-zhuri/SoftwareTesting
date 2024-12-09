package hu.unideb.inf;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemUserImageStepDefs extends AbstractStepDefs {


    @Then("all products should have the same image")
    public void allProductsShouldHaveTheSameImage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the inventory items to be present
        List<WebElement> inventoryItems = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.cssSelector(".inventory_item_img img")
        ));

        if (inventoryItems.isEmpty()) {
            throw new AssertionError("No product images found in the inventory.");
        }

        // Get the src of the first image
        String firstImageSrc = inventoryItems.get(0).getAttribute("src");

        // Check all images against the first one
        for (WebElement item : inventoryItems) {
            String currentImageSrc = item.getAttribute("src");
            if (!currentImageSrc.equals(firstImageSrc)) {
                throw new AssertionError("Image mismatch found. Expected: " + firstImageSrc + ", but found: " + currentImageSrc);
            }
        }

        System.out.println("All products have the same image.");


    }}