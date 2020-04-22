package org.github.seleniumjava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By txtUserName = By.id("username");
    private final By txtPassword = By.id("password");
    private final By lnkInWard = By.id("Inpatient Ward");
    private final By btnLogin = By.id("loginButton");
    private final By lnkLogOut = By.cssSelector(".nav-item.logout");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterUserName(String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
        return this;
    }

    public HomePage enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
        return this;
    }

    public void login() {
        driver.findElement(lnkInWard).click();
        driver.findElement(btnLogin).click();
    }

    public boolean isLogOutDisplayed() {
        return driver.findElement(lnkLogOut).isDisplayed();
    }
}
