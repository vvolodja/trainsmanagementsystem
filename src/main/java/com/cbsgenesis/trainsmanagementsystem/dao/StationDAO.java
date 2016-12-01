package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Created by beClever on 29.11.16.
 */
public class StationDAO implements GenericDAO<Station> {
    @Override
    public Station getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Station station) {
        String stationToString = station.getId() + "," + station.getName() + "," + station.getDescription() + "/";
    }

    @Override
    public void updateEntity(Station entity) {

    }

    @Override
    public void removeEntity(Station entity) {

    }
}
