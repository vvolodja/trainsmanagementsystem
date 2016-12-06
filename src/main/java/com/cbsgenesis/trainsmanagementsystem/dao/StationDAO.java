package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Station;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Station}
 *
 * @author Eugene Suleimanov
 */
public class StationDAO implements GenericDAO<Station> {

    @Override
    public Station getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Station station) {
        String stationToString = station.getId() + "," + station.getName() + "," + station.getDescription() + "/";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/beClever/IdeaProjects/TrainsManagementSystem/src/resources/database_production/stations.txt"))) {
            writer.write(stationToString);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Station entity) {

    }

    @Override
    public void removeEntity(Station entity) {

    }
}
