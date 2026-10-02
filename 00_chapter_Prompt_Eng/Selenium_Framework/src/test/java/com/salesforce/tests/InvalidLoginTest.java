package com.salesforce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.pages.LoginPage;

public class InvalidLoginTest {
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
            throw new RuntimeException("Failed to initialize the browser for invalid login test", e);
        }
    }

    @Test(description = "Verify invalid Salesforce login error handling")
    public void invalidLoginScenario() {
        try {
            loginPage.enterUsername("invalid.user@example.com");
            loginPage.enterPassword("InvalidPassword123");
            loginPage.clickLogin();
            Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Invalid login did not show the expected error message.");
            Assert.assertFalse(loginPage.isLoginSuccessful(), "Invalid login unexpectedly succeeded.");
        } catch (Exception e) {
            throw new RuntimeException("Invalid login scenario failed unexpectedly", e);
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
