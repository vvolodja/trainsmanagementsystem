package com.cbsgenesis.trainsmanagementsystem.model.factiories;

/**
 * Base interface for all factories.
 *
 * @author Eugene Suliemanov
 */
public interface EntityFactory<T> {
    T createEntity();

    T createEntity(String parameter);
}
