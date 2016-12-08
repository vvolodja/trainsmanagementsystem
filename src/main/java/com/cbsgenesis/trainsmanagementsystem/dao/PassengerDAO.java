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
        Passenger passenger = new Passenger();

        try(BufferedReader reader = new BufferedReader(new FileReader("src/resources/database_test/passengers.txt"))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");
                    Long firstLong = Long.parseLong(splitedLine[0]);



                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        removeEntity(passenger);

        saveEntity(passenger);
    }

    @Override
    public void removeEntity(Passenger passenger) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/resources/database_test/passengers.txt"))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == passenger.getId()) {
                        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/database_test/passengers.txt"))) {
                            writer.write("");
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
