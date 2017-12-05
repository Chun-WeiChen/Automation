package com.chun.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindUtils {

    private static int waitTime = 20;

    /**
     * Get an object from web page via CSS selector
     *
     * @param driver    Web driver to invoke actions on
     * @param elementID CSS for the element
     * @return Return found element
     */
    public static WebElement getObject(WebDriver driver, String elementID) {
        waitForElement(driver, elementID);
        WebElement element = driver.findElement(By.cssSelector(elementID));
        return element;
    }

    /**
     * Waits for the desired element. Elements are selected via CSS selector.
     *
     * @param driver    Web driver to invoke actions on
     * @param elementID CSS selector ID for the element
     */
    public static void waitForElement(WebDriver driver, String elementID) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitTime);
        driverWait.ignoring(StaleElementReferenceException.class);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementID)));
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementID)));
        driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementID)));
    }

}
