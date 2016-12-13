package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.PassengerDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.util.ArrayList;

/**
 * Controller for class {@link Passenger}
 *
 * @author  Andre Babenko
 */
public class PassengerController {
    PassengerDAO passengerDAO = new PassengerDAO();

    public ArrayList<Passenger> showAllPassengers() {
        return passengerDAO.getAllEntitys();
    }
}
