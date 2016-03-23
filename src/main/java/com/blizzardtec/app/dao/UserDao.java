 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.dao;

import com.blizzardtec.app.model.UserObj;

/**
 * @author Barnaby Golden
 *
 */
public interface UserDao extends GenericDao<UserObj, Long> {

    /**
     * Find by username.
     * @param username the username to search on
     * @return populated <code>User</code> object
     */
    UserObj findByUsername(String username);
}
