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
    private Date serviceDate;

    public Locomotive() {
    }

    public Locomotive(int capacity, int power, int yearOfIssue, String fuelType, Date serviceDate) {
        this.capacity = capacity;
        this.power = power;
        this.yearOfIssue = yearOfIssue;
        this.fuelType = fuelType;
        this.serviceDate = serviceDate;
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

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }
}
