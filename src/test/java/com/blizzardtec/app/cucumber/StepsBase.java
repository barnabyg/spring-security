 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Barnaby Golden
 *
 */
public class StepsBase {

    /**
     * Standard delay in ms.
     */
    protected static final int DELAY = 500;
    /**
     * Standard page load timeout in ms.
     */
    private static final int TIMEOUT = 5000;
    /**
     * Base URL.
     */
    public static final String BASE_URL = "http://localhost:8080/";
    /**
     * Window height.
     */
    private static final int HEIGHT = 1000;
    /**
     * Window width.
     */
    private static final int WIDTH = 1200;
    /**
     * Driver.
     */
    private WebDriver driver;

    /**
     * @return the driver
     */
    protected final WebDriver getDriver() {

        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().setSize(new Dimension(WIDTH, HEIGHT));
        }

        return driver;
    }

    /**
     * @param driver the driver to set
     */
    protected final void setDriver(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Fill a field with a string.
     * @param id the id of the element
     * @param value the string to send to the element
     * @throws InterruptedException thrown
     */
    protected final void fillField(final String id, final String value)
                                        throws InterruptedException {

        final WebElement element = getDriver().findElement(By.id(id));

        element.sendKeys(value);

        Thread.sleep(DELAY);
    }

    /**
     * Click on a submit button.
     * @param buttonName id of the submit button
     * @throws InterruptedException thrown
     */
    protected final void hitSubmit(final String buttonName)
                                        throws InterruptedException {

        final WebElement element =
                getDriver().findElement(By.id(buttonName));

        element.sendKeys(Keys.RETURN);

        (new WebDriverWait(getDriver(), TIMEOUT)).until(
                ExpectedConditions.stalenessOf(element));

        Thread.sleep(DELAY);
    }

    /**
     * Go to the page indicated by the given action.
     * @param action the base action name
     */
    protected final void gotoUrl(final String action) {

        final String url = BASE_URL + action + ".go";
        getDriver().get(url);
    }
}
