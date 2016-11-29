package com.cbsgenesis.trainsmanagementsystem.model;

import javax.xml.crypto.Data;

/**
 * Created by Java on 29.11.2016.
 */
public class Locomotive extends NamedEntity {

    private int capacity;
    private int power;
    private int yearOfIssue;
    private String fuelType;
    private Data service;

    public Locomotive() {
    }

    public Locomotive(int capacity, int power, int yearOfIssue, String fuelType, Data service) {
        this.capacity = capacity;
        this.power = power;
        this.yearOfIssue = yearOfIssue;
        this.fuelType = fuelType;
        this.service = service;
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

    public Data getService() {
        return service;
    }

    public void setService(Data service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "capacity=" + capacity +
                ", power=" + power +
                ", yearOfIssue=" + yearOfIssue +
                ", fuelType='" + fuelType + '\'' +
                ", service=" + service +
                '}';
    }
}
