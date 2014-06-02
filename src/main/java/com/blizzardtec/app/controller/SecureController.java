 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Barnaby Golden
 *
 */
@Controller
public final class SecureController extends BaseController {

    /**
     * Request handler for secure page.
     *
     * @return JSP mapping
     */
    @RequestMapping(value = SECURE_ACTION,
                   method = RequestMethod.GET)
    public String home() {

        return SECURE_PAGE;
    }
}
