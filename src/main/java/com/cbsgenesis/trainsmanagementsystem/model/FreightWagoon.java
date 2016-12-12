package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a freight Wagoon.
 *
 * @author @Eugeny Nenenko
 */
public class FreightWagoon extends Wagoon{
    private String typeOfCargoWagoon;
    private int dimensionOfWagoon;

    public FreightWagoon(int weight) {
        super(weight);
    }

    public FreightWagoon(int weight, String typeOfCargoWagoon) {
        super(weight);
        this.typeOfCargoWagoon = typeOfCargoWagoon;
    }

    public FreightWagoon(String typeOfCargoWagoon) {
        this.typeOfCargoWagoon = typeOfCargoWagoon;
    }

    public String getTypeOfCargoWagoon() {
        return typeOfCargoWagoon;
    }

    public void setTypeOfCargoWagoon(String typeOfCargoWagoon) {
        this.typeOfCargoWagoon = typeOfCargoWagoon;
    }

    public int getDimensionOfWagoon() {
        return dimensionOfWagoon;
    }

    public void setDimensionOfWagoon(int dimensionOfWagoon) {
        this.dimensionOfWagoon = dimensionOfWagoon;
    }

    @Override
    public String toString() {
        return "FreightWagoon{" +
                "typeOfCargoWagoon='" + typeOfCargoWagoon + '\'' +
                ", dimensionOfWagoon=" + dimensionOfWagoon +
                '}';
    }
}
