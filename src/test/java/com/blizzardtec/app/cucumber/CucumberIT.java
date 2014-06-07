 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * @author Barnaby Golden
 *
 */
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(format = {
        "pretty",
        "junit:target/cucumber-junit-report/allcukes.xml",
        "html:target/cucumber",
        "json:target/cucumber.json" })
public final class CucumberIT {

}
