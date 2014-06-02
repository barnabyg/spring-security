 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app;

import org.springframework.beans.factory.annotation.Autowired;

import com.blizzardtec.app.dao.UserDao;
import com.blizzardtec.app.model.User;

/**
 * @author Barnaby Golden
 *
 */
public final class BusinessDelegateImpl implements BusinessDelegate {

    /**
     * User DAO.
     */
    @Autowired
    private transient UserDao userDao;

    /**
     * {@inheritDoc}
     */
    public void createUser(final User user) {

        userDao.create(user);
    }

    /**
     * {@inheritDoc}
     */
    public User getUser(final String username) {

        return userDao.findByUsername(username);
    }

}
