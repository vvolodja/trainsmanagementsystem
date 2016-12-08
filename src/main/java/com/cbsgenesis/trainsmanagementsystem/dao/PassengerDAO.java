package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.io.*;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Passenger}.
 *
 * @author Andrey Babenko.
 */
public class PassengerDAO implements GenericDAO<Passenger> {
    String filePath = "src/resources/database_test/passengers.txt";

    @Override
    public Passenger getEntityById(Long id) {
        Passenger passenger = new Passenger();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == id) {
                        passenger.setId(firstLong);
                        passenger.setFirstName(splitedLine[1]);
                        passenger.setLastName(splitedLine[2]);
                        passenger.setTicketId(Long.parseLong(splitedLine[3]));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passenger;
    }

    @Override
    public void saveEntity(Passenger passenger) {
        String passengerToString = passenger.getId() + "," +
                passenger.getFirstName() + "," +
                passenger.getLastName() + "," +
                passenger.getTicketId() + "/";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
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
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == passenger.getId()) {
                        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
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
