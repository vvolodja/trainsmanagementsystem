package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Created by Java on 29.11.2016.
 */
public class Wagoon extends NamedEntity{
    private String type;
    private int numberOfSeats;
    private int weight;

    public Wagoon(String type, int numberOfSeats, int weight) {
        this.type = type;
        this.numberOfSeats = numberOfSeats;
        this.weight = weight;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Wagoon{" +
                "type='" + type + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", weight=" + weight +
                '}';
    }
}
