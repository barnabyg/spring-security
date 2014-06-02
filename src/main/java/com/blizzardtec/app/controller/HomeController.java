/**
 *
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
public final class HomeController extends BaseController {

    /**
     * Request handler for home page.
     *
     * @return JSP mapping
     */
    @RequestMapping(value = HOME_ACTION,
                   method = RequestMethod.GET)
    public String home() {

        return HOME_PAGE;
    }
}
