 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.startup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.blizzardtec.app.TestBase;

/**
 * @author Barnaby Golden
 *
 */
public final class StartupTest extends TestBase {

    /**
     * Test the preload.
     */
    @Test
    public void preloadTest() {

        final Preload preloader = new Preload();

        preloader.run();

        assertEquals("Dummy test", 1, 1);
    }
}
