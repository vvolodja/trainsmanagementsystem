package com.cbsgenesis.trainsmanagementsystem.model;

import java.util.Date;

/**
 * Simple JavaBean domain object that represents a Locomotive
 */
public class Locomotive extends NamedEntity {

    private int capacity;
    private int power;
    private int yearOfIssue;
    private String fuelType;
    private Date lastServiceDate;

    public Locomotive() {
    }

    public Locomotive(int capacity, int power, int yearOfIssue, String fuelType, Date lastServiceDate) {
        this.capacity = capacity;
        this.power = power;
        this.yearOfIssue = yearOfIssue;
        this.fuelType = fuelType;
        this.lastServiceDate = lastServiceDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
