package com.salesforce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.pages.LoginPage;

public class ValidLoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            loginPage = new LoginPage(driver);
            loginPage.openLoginPage("https://login.salesforce.com/?locale=in");
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize the browser for valid login test", e);
        }
    }

    @Test(description = "Verify valid Salesforce login")
    public void validLoginScenario() {
        String username = System.getProperty("salesforce.username");
        String password = System.getProperty("salesforce.password");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new SkipException("Set -Dsalesforce.username and -Dsalesforce.password to run the valid login scenario.");
        }

        try {
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickLogin();
            Assert.assertTrue(loginPage.isLoginSuccessful(), "Valid login did not redirect to the expected page.");
        } catch (Exception e) {
            throw new RuntimeException("Valid login scenario failed unexpectedly", e);
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
