package com.cbsgenesis.trainsmanagementsystem.controller;


import com.cbsgenesis.trainsmanagementsystem.dao.PassengerWaggonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;
import com.cbsgenesis.trainsmanagementsystem.model.PassengerWaggon;

import java.util.ArrayList;

/**
 * Created by Java on 22.12.2016.
 *
 * @author Julia Konoh
 */
public class PassengerWagoonController {

    private PassengerWaggonDAO passengerWaggonDAO = new PassengerWaggonDAO();

    public ArrayList<PassengerWaggon> getALLEntities(){ return passengerWaggonDAO.getAllEntities();}

    public PassengerWaggon getEntityById(Long Id){return passengerWaggonDAO.getEntityById(Id);}

    public void saveEntity(PassengerWaggon passengerWaggon){passengerWaggonDAO.saveEntity(passengerWaggon);}

    public void updateEntity(PassengerWaggon passengerWaggon){passengerWaggonDAO.updateEntity(passengerWaggon);}

    public void removeEntity(PassengerWaggon passengerWaggon){passengerWaggonDAO.removeEntity(passengerWaggon);}



}
