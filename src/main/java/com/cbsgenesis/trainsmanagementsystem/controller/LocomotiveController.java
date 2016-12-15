package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.LocomotiveDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.util.List;

/**
 *Controller for class {@link Locomotive}
 * @Author Evgenij Lukashik
 */
public class LocomotiveController {

    LocomotiveDAO locomotiveDAO = new LocomotiveDAO();

    public List<Locomotive>showAllLocomotives(){
        return locomotiveDAO.getAllEntitys();

    }
    public Locomotive getEntityById(Long id){
        return locomotiveDAO.getEntityById(id);
    }

    public void saveEntity(Locomotive locomotive){
        locomotiveDAO.saveEntity(locomotive);
    }
    public void  updateEntity(Locomotive locomotive){
        locomotiveDAO.updateEntity(locomotive);
    }

    public  void removeEntity(Locomotive locomotive){
        locomotiveDAO.removeEntity(locomotive);
    }

}
