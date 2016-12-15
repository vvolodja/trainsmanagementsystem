package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a Passenger Wagoon.
 *
 * @author @Eugeny Nenenko
 */

public class PassengerWaggon extends Wagoon{
    private String typeOfComfort;
    private Integer numberOfSeats;

    public PassengerWaggon() {
    }

    public PassengerWaggon(int weight) {
        super(weight);
    }

    public PassengerWaggon(int weight, String typeOfComfort) {
        super(weight);
        this.typeOfComfort = typeOfComfort;
    }

    public PassengerWaggon(String typeOfComfort) {
        this.typeOfComfort = typeOfComfort;
    }

    public String getTypeOfComfort() {
        return typeOfComfort;
    }

    public void setTypeOfComfort(String typeOfComfort) {
        this.typeOfComfort = typeOfComfort;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "PassengerWaggon{" +
                "typeOfComfort='" + typeOfComfort + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
