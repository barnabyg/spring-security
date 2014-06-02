 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.test.context.ContextConfiguration;

/**
 * @author Barnaby Golden
 *
 */
@ContextConfiguration(locations = { "test-context.xml" })
public class TestBase {

    /**
     * Create a date from a string and given date format.
     * Fails on any parse errors.
     * @param dateFormat the date format to use
     * @param dateStr a date in string format
     * @return new date object
     */
      protected final Date makeDate(
                  final String dateFormat, final String dateStr) {

          Date date = null;

          try {
              date = new SimpleDateFormat(dateFormat, Locale.UK).parse(dateStr);
          } catch (ParseException e) {
              fail(e.getMessage());
          }

          return date;
      }
}
