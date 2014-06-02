 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author Barnaby Golden
 *
 */
public class BaseController {

    /**
     * Home page.
     */
    public static final String HOME_PAGE = "home";
    /**
     * Corresponding action for home page.
     */
    public static final String HOME_ACTION = "/home";

    /**
     * Login page.
     */
    public static final String LOGIN_PAGE = "login";
    /**
     * Corresponding action for login page.
     */
    public static final String LOGIN_ACTION = "/login";

    /**
     * Secure page.
     */
    public static final String SECURE_PAGE = "secure";
    /**
     * Corresponding action for secure page.
     */
    public static final String SECURE_ACTION = "/secure";

    /**
     * Format a forward response for a given action.
     * @param action action to forward to
     * @return formated forward string
     */
    protected final String forward(final String action) {

        return "forward:" + action + ".go";
    }

    /**
     * Format a redirect response including query string parameters.
     * @param action action to forward to
     * @param params parameters in the form "x=y"
     * @return forward string
     */
    protected final String redirect(
                final String action, final Object... params) {

        final StringBuffer buffer = new StringBuffer();

        buffer.append("redirect:" + action + ".go?");

        for (final Object param: params) {
            buffer.append((String) param);
        }

        return buffer.toString();
    }

    /**
     * Add a binder to handle empty number fields.
     * Otherwise there will be a conversion error.
     * @param binder param
     */
    @InitBinder
    public final void initBinder(final WebDataBinder binder) {

       binder.registerCustomEditor(
               Float.class, new MyCustomNumberEditor(Float.class, true));

       binder.registerCustomEditor(
               Integer.class, new MyCustomNumberEditor(Integer.class, true));
    }
}
