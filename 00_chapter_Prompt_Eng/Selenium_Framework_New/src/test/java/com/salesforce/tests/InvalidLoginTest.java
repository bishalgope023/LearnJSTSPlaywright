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
            loginPage = new LoginPage(driver);
            loginPage.openLoginPage("https://login.salesforce.com/?locale=in");
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize invalid login test setup", e);
        }
    }

    @Test(description = "Validate login validation messaging for invalid credentials")
    public void invalidLoginScenario() {
        try {
            loginPage.doLogin("invalid.user@example.com", "InvalidPassword123");
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Expected invalid login error message to be displayed.");
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
