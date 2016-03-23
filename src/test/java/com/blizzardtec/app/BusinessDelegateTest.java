 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.blizzardtec.app.model.UserObj;

/**
 * @author Barnaby Golden
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public final class BusinessDelegateTest extends TestBase {

    /**
     * Surname.
     */
    private static final String SURNAME = "surname";
    /**
     * Forename.
     */
    private static final String FORENAME = "forename";
    /**
     * Username.
     */
    private static final String USERNAME = "username";

    /**
     * Business delegate.
     */
    @Autowired
    private transient BusinessDelegate delegate;

    /**
     * Tests relating to user objects.
     */
    @Test
    public void userTests() {
        final UserObj user = new UserObj();

        user.setUsername(USERNAME);
        user.setForename(FORENAME);
        user.setSurname(SURNAME);

        delegate.createUser(user);

        final UserObj user2 = delegate.getUser(USERNAME);

        assertEquals("Forenames did not match", FORENAME, user2.getForename());
        assertEquals("Surnames did not match", SURNAME, user2.getSurname());
        assertEquals("Username did not match", USERNAME, user2.getUsername());
    }
}
