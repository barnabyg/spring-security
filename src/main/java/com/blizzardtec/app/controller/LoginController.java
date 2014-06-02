 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Barnaby Golden
 *
 */
@Controller
public final class LoginController extends BaseController {

    /**
     * Request handler for login page.
     *
     * @param error error
     * @param model model
     * @return JSP mapping
     */
    @RequestMapping(value = LOGIN_ACTION,
                   method = RequestMethod.GET)
    public String loginForm(
        @RequestParam(value = "error", required = false) final boolean error,
        final ModelMap model) {

        // Add an error message to the model if login is unsuccessful.
        // The 'error' parameter is set to true based
        // on if the authentication has failed.
        // We declared this under the authentication-failure-url
        // attribute inside the spring-security.xml
        /* See below:
         <form-login
          login-page="/krams/auth/login"
          authentication-failure-url="/krams/auth/login?error=true"
          default-target-url="/krams/main/common"/>*/

        if (error) {
         // Assign an error message
         model.put(
             "error", "You have entered an invalid username or password");
        } else {
         model.put("error", "");
        }

        // This will resolve to /WEB-INF/jsp/loginpage.jsp

        return LOGIN_PAGE;
    }
}
