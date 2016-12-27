package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

import java.util.ArrayList;

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
