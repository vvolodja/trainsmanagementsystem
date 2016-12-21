package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a Passenger Wagoon.
 *
 * @author @Eugeny Nenenko
 */

public class PassengerWaggon extends Wagoon{
    private String typeOfWagoonComfort;
    int quantityOfSeats;


    public PassengerWaggon(int weight, String typeOfWagoonComfort, int quantityOfSeats) {
        super(weight);
        this.typeOfWagoonComfort = typeOfWagoonComfort;
        this.quantityOfSeats = quantityOfSeats;
    }

    public PassengerWaggon(int weight) {
        super(weight);
    }

    public PassengerWaggon() {

    }

    public String getTypeOfWagoonComfort() {
        return typeOfWagoonComfort;
    }

    public void setTypeOfWagoonComfort(String typeOfWagoonComfort) {
        this.typeOfWagoonComfort = typeOfWagoonComfort;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public void setQuantityOfSeats(int quantityOfSeats) {
        this.quantityOfSeats = quantityOfSeats;
    }

    @Override
    public String toString() {
        return "PassengerWaggon{" +
                "typeOfWagoonComfort='" + typeOfWagoonComfort + '\'' +
                ", quantityOfSeats=" + quantityOfSeats +
                '}';
    }
}
