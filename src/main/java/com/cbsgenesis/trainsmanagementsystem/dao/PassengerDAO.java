package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.io.*;
import java.util.Scanner;

/**
 * Implementation of {@link GenericDAO} interface for class {@link PassengerDAO}.
 *
 * Created by andreyb1990 on 12/1/16.
 */
public class PassengerDAO implements GenericDAO<Passenger> {

    @Override
    public Passenger getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Passenger passenger) {
        String passengerToString = passenger.getId() + "," + passenger.getName() + "," + passenger.getTicket()+ "/";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/andreyb1990/IdeaProjects/TrainsManagementSystem/src/resources/database_test/passengers.txt"))) {
            writer.write(passengerToString);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateEntity(Passenger passenger) {
        String passengerToString = passenger.getId() + "," + passenger.getName() + "," + passenger.getTicket()+ "/";




    }

    @Override
    public void removeEntity(Passenger passenger) {

    }
}
