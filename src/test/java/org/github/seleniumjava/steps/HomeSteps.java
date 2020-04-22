package org.github.seleniumjava.steps;

import org.github.seleniumjava.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private final HomePage homePage;

    public HomeSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public void Login(String userName, String password) {
        homePage.enterUserName(userName)
                .enterPassword(password)
                .login();
    }

    public boolean isLoginSuccessful() {
        return homePage.isLogOutDisplayed();
    }
}
