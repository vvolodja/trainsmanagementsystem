package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.CargoDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

import java.util.ArrayList;

/**
 * Created by Евгений on 14.12.2016.
 */
public class CargoController {
    private CargoDAO cargoDAO=new CargoDAO();

    public ArrayList<Cargo> getAllEntities(){
        return cargoDAO.getAllEntities();
    }
    public Cargo getEntityById(Long id){
        return cargoDAO.getEntityById(id);

    }
    public void saveEntity(Cargo cargo){
        cargoDAO.saveEntity(cargo);
    }
    public void updateEntity(Cargo cargo){
        cargoDAO.updateEntity(cargo);
    }

    public void removeEntity(Cargo cargo){
        cargoDAO.removeEntity(cargo);
    }

}
