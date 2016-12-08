package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a freight Waggon.
 *
 * @author Eugene Suleimanov
 */
public class FreightWagoon extends Wagoon{
    private String typeOfCargoForWagoon;
    private int dimension;

    public FreightWagoon(int weight, String typeOfCargoForWagoon) {
        super(weight);
        this.typeOfCargoForWagoon = typeOfCargoForWagoon;
    }

    public FreightWagoon(String typeOfCargoForWagoon) {
        this.typeOfCargoForWagoon = typeOfCargoForWagoon;
    }

    public FreightWagoon(int weight) {
        super(weight);
    }

    public String getTypeOfCargoForWagoon() {
        return typeOfCargoForWagoon;
    }

    public void setTypeOfCargoForWagoon(String typeOfCargoForWagoon) {
        this.typeOfCargoForWagoon = typeOfCargoForWagoon;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "FreightWagoon{" +
                "typeOfCargoForWagoon='" + typeOfCargoForWagoon + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}
