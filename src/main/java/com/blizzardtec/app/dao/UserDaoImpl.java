 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.dao;

import java.util.List;

import com.blizzardtec.app.model.User;

/**
 * @author Barnaby Golden
 *
 */
public final class UserDaoImpl
        extends GenericDaoImpl<User, Long> implements UserDao {

    /**
     * @param type class type
     */
    public UserDaoImpl(final Class<User> type) {
        super(type);
    }

    /**
     * {@inheritDoc}
     */
    public User findByUsername(final String username) {

        User user = null;

        @SuppressWarnings("unchecked")
        final List<User> list =
                getHibernateTemplate().find("from "
                        + User.class.getName()
                        + " u where u.username = ?", username);

        if (!list.isEmpty()) {
            user = list.get(0);
        }

        return user;
    }
}
