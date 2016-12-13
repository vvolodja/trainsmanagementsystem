package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.io.*;
import java.util.ArrayList;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Passenger}.
 *
 * @author Andrey Babenko
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

                    if (firstLong.equals(id)) {
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
        Passenger existingPassenger = getEntityById(passenger.getId());

        if (passenger.getId().equals(existingPassenger.getId())) {
            System.err.println("Passenger with such id is already existing");
        } else {
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                StringBuilder existingFile = new StringBuilder();
                String read;

                while ((read = reader.readLine()) != null) {
                    existingFile.append(read);
                }

                String passengerToString = passenger.getId() + "," +
                        passenger.getFirstName() + "," +
                        passenger.getLastName() + "," +
                        passenger.getTicketId() + "/";

                String newFile;

                if (existingFile.toString().equals("")) {
                    newFile = existingFile.append(passengerToString).toString();
                } else {
                    newFile = existingFile.append("\n").append(passengerToString).toString();
                }

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(newFile);
                }catch (IOException e){
                    e.printStackTrace();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
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

                    if (firstLong.equals(passenger.getId())) {
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

    public ArrayList<Passenger> getAllEntitys() {
        ArrayList<Passenger> passengers = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Passenger passenger = new Passenger();

                    passenger.setId(Long.parseLong(splitedLine[0]));
                    passenger.setFirstName(splitedLine[1]);
                    passenger.setLastName(splitedLine[2]);
                    passenger.setTicketId(Long.parseLong(splitedLine[3]));

                    passengers.add(passenger);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return passengers;

    }
}
