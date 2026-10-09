package com.salesforce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class,'error') or @id='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void openLoginPage(String url) {
        try {
            driver.get(url);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        } catch (Exception e) {
            throw new RuntimeException("Unable to open Salesforce login page", e);
        }
    }

    public void doLogin(String userName, String passWord) {
        try {
            wait.until(ExpectedConditions.visibilityOf(username)).clear();
            username.sendKeys(userName);
            wait.until(ExpectedConditions.visibilityOf(password)).clear();
            password.sendKeys(passWord);
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        } catch (Exception e) {
            throw new RuntimeException("Unable to complete Salesforce login operation", e);
        }
    }

    public boolean isErrorDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public String getErrorText() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(errorMessage)).getText();
        } catch (TimeoutException e) {
            return "";
        }
    }

    public boolean isLoginSuccessful() {
        try {
            wait.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("lightning"),
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'slds-global-header')]")),
                    ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='username']"))
            ));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
