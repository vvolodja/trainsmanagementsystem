package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Created by Java on 29.11.2016.
 */
public class Cargo extends NamedEntity {
    private String type;
    private int volume;
    private int weight;
    private int dimension;
    private int quantityOfCars;

    public Cargo() {
    }

    public Cargo(String type, int volume, int weight, int dimension, int quantityOfCars) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
        this.dimension = dimension;
        this.quantityOfCars = quantityOfCars;
    }

    public Cargo(String name, String type, int volume, int weight, int dimension, int quantityOfCars) {
        super(name);
        this.type = type;
        this.volume = volume;
        this.weight = weight;
        this.dimension = dimension;
        this.quantityOfCars = quantityOfCars;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getQuantityOfCars() {
        return quantityOfCars;
    }

    public void setQuantityOfCars(int quantityOfCars) {
        this.quantityOfCars = quantityOfCars;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", dimension=" + dimension +
                ", quantityOfCars=" + quantityOfCars +
                '}';
    }
}
