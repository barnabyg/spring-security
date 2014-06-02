 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.dao;

import com.blizzardtec.app.model.User;

/**
 * @author Barnaby Golden
 *
 */
public interface UserDao extends GenericDao<User, Long> {

    /**
     * Find by username.
     * @param username the username to search on
     * @return populated <code>User</code> object
     */
    User findByUsername(String username);
}
