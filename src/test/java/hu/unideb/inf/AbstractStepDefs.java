package hu.unideb.inf;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public abstract class AbstractStepDefs {

    protected static final int WAIT_TIME = 20;

    protected static final WebDriver driver; //PRIVATE U KON E KOM BO PROTECTED

    protected static HomePage homePage; ///Private u kon

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        homePage = new HomePage(driver);
    }









}
