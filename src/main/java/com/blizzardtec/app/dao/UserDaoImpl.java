 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.dao;

import java.util.List;

import com.blizzardtec.app.model.UserObj;

/**
 * @author Barnaby Golden
 *
 */
public final class UserDaoImpl
        extends GenericDaoImpl<UserObj, Long> implements UserDao {

    /**
     * @param type class type
     */
    public UserDaoImpl(final Class<UserObj> type) {
        super(type);
    }

    /**
     * {@inheritDoc}
     */
    public UserObj findByUsername(final String username) {

        UserObj user = null;

        @SuppressWarnings("unchecked")
//        final List<User> list = (List<User>)
//                getHibernateTemplate().find("from "
//                        + User.class.getName()
//                        + " u where u.username = :username", username);

        final List<UserObj> list = getSessionFactory().getCurrentSession()
                .createQuery("from " + UserObj.class.getName()
                        + " u where u.username = :username")
                .setString("username", username)
                .list();

        if (!list.isEmpty()) {
            user = list.get(0);
        }

        return user;
    }
}
