 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.startup;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Barnaby Golden
 *
 */
public final class Startup
        implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * {@inheritDoc}
     */
    public void onApplicationEvent(final ContextRefreshedEvent event) {

        // call any methods you want to be acted on at startup
        final Preload preload = new Preload();
        preload.run();
    }
}
