 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

import com.blizzardtec.app.controller.BaseController;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Barnaby Golden
 *
 */
public final class HomeSteps extends StepsBase {

    /**
     * Run before each scenario.
     */
    @Before("@home")
    public void beforeScenario() {
        // before
    }

    /**
     * Given I visit the home page.
     * @throws Throwable thrown
     */
    @Given("^I visit the homepage$")
    public void visitHomepage() throws Throwable {

        gotoUrl(BaseController.HOME_ACTION);
    }

    /**
     * When I load the home page.
     * @throws Throwable thrown
     */
    @When("^I load the homepage$")
    public void loadHomepage() throws Throwable {

        Thread.sleep(DELAY);
    }

    /**
     * Then I see the page title.
     * @throws Throwable thrown
     */
    @Then("^I can see the title$")
    public void seeTitle() throws Throwable {

        final WebElement element =
                getDriver().findElement(By.id("title"));

        assertEquals("Did not find title element", "Home", element.getText());
    }

    /**
     * Run after each scenario.
     *
     * @throws InterruptedException
     *             will never be thrown
     */
    @After("@home")
    public void afterScenario() throws InterruptedException {

        getDriver().quit();
    }
}
