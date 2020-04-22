package org.github.seleniumjava.tests;

import org.github.seleniumjava.drivermanger.DriverManager;
import org.github.seleniumjava.steps.HomeSteps;
import org.github.seleniumjava.utils.PropertyReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class SampleLoginTest {
    WebDriver driver;
    HomeSteps homeSteps;

    @Before
    public void before() {
        driver = new DriverManager().getDriver(Objects.requireNonNull(PropertyReader.get("browser")));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.get(PropertyReader.get("url"));
        homeSteps = new HomeSteps(driver);
    }

    @Test
    public void statusCheck() {
        Assert.assertTrue(true);
    }

    @Test
    public void loginTest() {
        homeSteps
                .Login(PropertyReader.get("userName"), PropertyReader.get("password"));
        Assert.assertTrue("user should be able to login", homeSteps.isLoginSuccessful());
    }

    @After
    public void after() {
        driver.quit();
    }
}
