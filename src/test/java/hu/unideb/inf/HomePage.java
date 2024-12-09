package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static hu.unideb.inf.AbstractStepDefs.WAIT_TIME;

public class HomePage {

    private static final String PAGE_URL = "https://www.saucedemo.com/";

    private final WebDriver driver;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;
    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.summary_total_label")
    private WebElement priceLabel;

    @FindBy(css = "#checkout_info_container > div.checkout_info_wrapper > form > div.checkout_info > div.error-message-container > h3")
    private WebElement expectedErrorMessage;

    private  final Map<String, By> textFields = Map.of( // e kom hek static
       "Username", By.id("user-name"),
       "Password", By.id("password"),
       "First Name", By.id("first-name"),
       "Last Name", By.id("last-name"),
       "Zip Code", By.id("postal-code")
    );

    private  final Map<String, By> itemButtons = Map.of( // e kom hek static
       "Sauce Labs Backpack", By.id("add-to-cart-sauce-labs-backpack"),
       "Sauce Labs Bike Light", By.id("add-to-cart-sauce-labs-bike-light"),
       "Sauce Labs Bolt T-Shirt", By.id("add-to-cart-sauce-labs-bolt-t-shirt"),
       "Sauce Labs Fleece Jacket", By.id("add-to-cart-sauce-labs-fleece-jacket"),
       "Sauce Labs Onesie", By.id("add-to-cart-sauce-labs-onesie"),
       "Test.allTheThings() T-Shirt (Red)", By.id("add-to-cart-test.allthethings()-t-shirt-(red)")
    );

    private final Map<String, By> navigationButtons = Map.of( // e kom hek static
        "Login", By.id("login-button"),
        "Cart", By.className("shopping_cart_link"),
        "Checkout", By.id("checkout"),
        "Continue", By.id("continue"),
            "Menu", By.id("react-burger-menu-btn"), //UN
            "Logout", By.id("logout_sidebar_link"), //UNN
            "Remove", By.id("remove-sauce-labs-backpack"),//UN
            "Cancel", By.id("cancel"),// un
            "Finish", By.id("finish"),
            "RemoveBikeLight",By.id("remove-sauce-labs-bike-light") //un

    );

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage() {
        driver.quit();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void addItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public String getTotal() {
        return priceLabel.getText();
    }

    public String getCartItemCount() {
        return driver.findElement(By.className("shopping_cart_badge")).getText();
    }



    private static final Map<String, By> menuButtons = Map.of( // UN E KOM BO
            "Menu", By.id("react-burger-menu-btn"),
            "Logout", By.id("logout_sidebar_link")
    );

    public void clickMenuButton(String button) {// UN E KOM BO
        driver.findElement(menuButtons.get(button)).click();
    }

    public boolean isLoginPageDisplayed() {// UN E KOM BO
        return driver.findElement(By.id("login-button")).isDisplayed();
    }

    public void selectFilterOption(String filterOption) { // Un e kom bo
        WebElement filterDropdown = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(filterDropdown);
        dropdown.selectByVisibleText(filterOption);
    }

    public List<Double> getItemPrices() { //Un e kom bo
        List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));
        return priceElements.stream()
                .map(priceElement -> Double.parseDouble(priceElement.getText().replace("$", "")))
                .toList();
    }

    public double getDisplayedTotal() { // Un e kom qit
        String totalText = driver.findElement(By.className("summary_total_label")).getText();
        return Double.parseDouble(totalText.replace("Total: $", ""));
    }









    public double getDisplayedTax() { //Un e kom bo
        String taxText = driver.findElement(By.className("summary_tax_label")).getText();
        return Double.parseDouble(taxText.replace("Tax: $", ""));
    }

    public double getDisplayedSubtotal() { //Un e kom bo
        String subtotalText = driver.findElement(By.className("summary_subtotal_label")).getText();
        return Double.parseDouble(subtotalText.replace("Item total: $", ""));
    }


    public String getExpected() {
        return expectedErrorMessage.getText();
    }



    public String getSelectedSortingOption() {// un
        WebElement filterDropdown = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(filterDropdown);
        return dropdown.getFirstSelectedOption().getText();
    }

























}
