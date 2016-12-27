package com.cbsgenesis.trainsmanagementsystem.model;

import java.util.Date;

/**
 * Simple JavaBean domain object that represents a Locomotive
 */
public class Locomotive extends NamedEntity {

    private Integer capacity;
    private Integer power;
    private Integer yearOfIssue;
    private String fuelType;
    private Date lastServiceDate;

    public Locomotive() {
    }

    public Locomotive(Integer capacity, Integer power, Integer yearOfIssue, String fuelType, Date lastServiceDate) {
        this.capacity = capacity;
        this.power = power;
        this.yearOfIssue = yearOfIssue;
        this.fuelType = fuelType;
        this.lastServiceDate = lastServiceDate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
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

    @Override
    public String toString() {
        return "Locomotive{" +
                "capacity=" + capacity +
                ", power=" + power +
                ", yearOfIssue=" + yearOfIssue +
                ", fuelType='" + fuelType + '\'' +
                ", lastServiceDate=" + lastServiceDate +
                '}';
    }
}
