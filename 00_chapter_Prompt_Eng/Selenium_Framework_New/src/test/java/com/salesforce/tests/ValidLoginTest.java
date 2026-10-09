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
            loginPage = new LoginPage(driver);
            loginPage.openLoginPage("https://login.salesforce.com/?locale=in");
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize valid login test setup", e);
        }
    }

    @Test(description = "Validate successful login to Salesforce")
    public void validLoginScenario() {
        String username = System.getProperty("salesforce.username");
        String password = System.getProperty("salesforce.password");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new SkipException("Set salesforce.username and salesforce.password before executing valid login test.");
        }

        try {
            loginPage.doLogin(username, password);
            Assert.assertTrue(loginPage.isLoginSuccessful(), "Expected successful login after valid credentials.");
        } catch (Exception e) {
            throw new RuntimeException("Valid login scenario failed", e);
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
