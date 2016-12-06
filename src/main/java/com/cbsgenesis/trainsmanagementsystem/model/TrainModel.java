package com.cbsgenesis.trainsmanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple class that represents trains
 *
 * Created by Andrey Babenko on 11/29/16.
 */
public class TrainModel extends NamedEntity {
    private Locomotive locomotive;
    private ArrayList<Wagoon> wagoons;
    private List<Station> stations;

    public TrainModel() {
    }

    public TrainModel(String name) {
        super(name);
    }

    public TrainModel(String name, Locomotive locomotive, ArrayList<Wagoon> wagoons, List<Station> stations) {
        super(name);
        this.locomotive = locomotive;
        this.wagoons = wagoons;
        this.stations = stations;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public ArrayList<Wagoon> getWagoons() {
        return wagoons;
    }

    public void setWagoons(ArrayList<Wagoon> wagoons) {
        this.wagoons = wagoons;
    }

    @Override
    public String toString() {
        return "TrainModel{" +
                "name=" + super.getName() +
                "locomotive=" + locomotive +
                ", wagoons=" + wagoons +
                ", stations=" + stations +
                '}';
    }
}
