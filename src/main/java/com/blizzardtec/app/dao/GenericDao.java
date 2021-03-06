 /*************************************************************************
 *  2013 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.blizzardtec.app.dao;

import java.io.Serializable;

/**
 * Generic ORM DAO interface.
 *
 * @author Barnaby Golden
 *
 * @param <T> param
 * @param <P> param
 */
public interface GenericDao<T, P extends Serializable> {

    /**
     * Create.
     * @param entity entity to save
     * @return entity primary key
     */
    P create(T entity);

    /**
     * Find by primary key.
     * @param id the id to use
     * @return entity
     */
    T retrieve(P id);

    /**
     * Update an entity.
     * @param entity entity to update
     */
    void update(T entity);

    /**
     * Delete.
     * @param entity entity to delete
     */
    void delete(T entity);
}
