package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.StationDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;
import com.cbsgenesis.trainsmanagementsystem.model.Station;

import java.util.ArrayList;

/**
 * Controller for class {@link Station}
 */
public class StationController {
    private StationDAO stationDAO=new StationDAO();

    public ArrayList<Station> getAllEntities(){
        return stationDAO.getAllEntities();
    }
    public Station getEntityById(Long id){
        return stationDAO.getEntityById(id);

    }
    public void saveEntity(Station station){
        stationDAO.saveEntity(station);
    }
    public void updateEntity(Station station){
        stationDAO.updateEntity(station);
    }

    public void removeEntity(Station station){
        stationDAO.removeEntity(station);
    }

}
