package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.PassengerDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.util.ArrayList;

/**
 * Controller for class {@link Passenger}
 *
 * @author  Andrey Babenko
 */
public class PassengerController {
    private PassengerDAO passengerDAO = new PassengerDAO();

    public ArrayList<Passenger> showAllPassengers() {
        return passengerDAO.getAllEntitys();
    }

    public Passenger getEntityById(Long id){
        return passengerDAO.getEntityById(id);
    }

    public void saveEntity(Passenger passenger) {
        passengerDAO.saveEntity(passenger);
    }

    public void updateEntity(Passenger passenger){
        passengerDAO.updateEntity(passenger);
    }

    public void removeEntity(Passenger passenger) {
        passengerDAO.removeEntity(passenger);
    }
}
