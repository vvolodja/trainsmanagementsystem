package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBeen domain object that represent Stations schedule of passenger trains;
 *
 * @author Julia Konoh;
 */
public class Station extends NamedEntity {
    private String description;

    public Station() {
    }

    public Station(String name, String description) {
        super(name);
        this.description = description;
    }

    public Station(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
