package com.cbsgenesis.trainsmanagementsystem.dao;

/**
 * Generic DAO class that contains common DAO methods
 *
 * @author Eugene Suleimanov
 */

public interface GenericDAO<T> {

    T getEntityById(Long id);

    void saveEntity(T entity);

    void updateEntity(T entity);

    void removeEntity(T entity);

}
