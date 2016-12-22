package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Created by Java on 29.11.2016.
 */
public class Cargo extends NamedEntity {
    private String type;
    private Integer volume;
    private Integer weight;
    private Integer dimension;
    private Integer quantityOfCars;

    public Cargo() {
    }

    public Cargo(String type, Integer volume, Integer weight, Integer dimension, Integer quantityOfCars) {
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

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Integer getQuantityOfCars() {
        return quantityOfCars;
    }

    public void setQuantityOfCars(Integer quantityOfCars) {
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
