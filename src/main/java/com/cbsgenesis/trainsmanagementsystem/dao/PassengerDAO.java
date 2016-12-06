package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.io.*;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Passenger}.
 *
 * Created by Andrey Babenko on 12/1/16.
 */
public class PassengerDAO implements GenericDAO<Passenger> {

    @Override
    public Passenger getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Passenger passenger) {
        String passengerToString = passenger.getId() + "," +
                passenger.getFirstName() + "," +
                passenger.getLastName() + "," +
                passenger.getTicket() + "/";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/database_test/passengers.txt"))) {
            writer.write(passengerToString);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateEntity(Passenger passenger) {




    }

    @Override
    public void removeEntity(Passenger passenger) {

    }
}
