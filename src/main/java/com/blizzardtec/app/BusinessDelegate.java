 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app;

import com.blizzardtec.app.model.User;

/**
 * @author Barnaby Golden
 *
 */
public interface BusinessDelegate {

    /**
     * Create a user.
     * @param user the <code>User</code> to persist
     */
    void createUser(User user);

    /**
     * Retrieve a user with the given username.
     * @param username the username to search for
     * @return populate <code>User</code> object
     */
    User getUser(String username);
}
