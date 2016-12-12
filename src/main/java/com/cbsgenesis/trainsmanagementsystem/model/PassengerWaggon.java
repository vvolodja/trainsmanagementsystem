package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a Passenger Wagoon.
 *
 * @author @Eugeny Nenenko
 */

public class PassengerWaggon extends Wagoon{
    private int numberOfSeats;
    private String type;

    public PassengerWaggon(int weight, int numberOfSeats) {
        super(weight);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PassengerWaggon{" +
                "numberOfSeats=" + numberOfSeats +
                ", type='" + type + '\'' +
                '}';
    }
}
