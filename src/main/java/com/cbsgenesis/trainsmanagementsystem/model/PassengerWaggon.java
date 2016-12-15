package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a Passenger Wagoon.
 *
 * @author @Eugeny Nenenko
 */

public class PassengerWaggon extends Wagoon{
<<<<<<< HEAD
    private String typeOfWagoonComfort;
    int quantityOfSeats;


    public PassengerWaggon(int weight, String typeOfWagoonComfort) {
        super(weight);
        this.typeOfWagoonComfort = typeOfWagoonComfort;
    }

    public PassengerWaggon(String typeOfWagoonComfort) {
        this.typeOfWagoonComfort = typeOfWagoonComfort;
    }
=======
    private String typeOfComfort;
    private int numberOfSeats;
>>>>>>> 43224d905f7024aa96b4da30db922052d1f2e031

    public PassengerWaggon(int weight) {
        super(weight);
    }

<<<<<<< HEAD
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
=======
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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
>>>>>>> 43224d905f7024aa96b4da30db922052d1f2e031
    }

    @Override
    public String toString() {
        return "PassengerWaggon{" +
<<<<<<< HEAD
                "typeOfWagoonComfort='" + typeOfWagoonComfort + '\'' +
                ", quantityOfSeats=" + quantityOfSeats +
=======
                "typeOfComfort='" + typeOfComfort + '\'' +
                ", numberOfSeats=" + numberOfSeats +
>>>>>>> 43224d905f7024aa96b4da30db922052d1f2e031
                '}';
    }
}
