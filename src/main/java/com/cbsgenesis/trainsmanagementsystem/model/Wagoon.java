package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple abstract class that represents a Wagoon.
 *
 * @author Eugene Suliemanov
 */
public abstract class Wagoon extends BaseEntity{
    private int weight;

    public Wagoon(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
