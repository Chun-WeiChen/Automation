package com.chun.tasks;

import com.chun.utility.Drivers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Task {

    private WebDriver driver;

    @BeforeEach
    public void initializeDriver() {
        driver = Drivers.chrome();
    }

    @Test
    public void test() {
        driver.get("https://www.facebook.com/");
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }

}
