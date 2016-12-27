package com.cbsgenesis.trainsmanagementsystem.dao;


import com.cbsgenesis.trainsmanagementsystem.model.Cargo;
import com.cbsgenesis.trainsmanagementsystem.model.PassengerWaggon;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Java on 01.12.2016.
 *
 * @author Julia Konoh
 *
 */
public class PassengerWaggonDAO implements GenericDAO<PassengerWaggon> {

    String filePath = "src/resources/database_test/passengers_wagoon.txt";


    @Override
    public PassengerWaggon getEntityById(Long id) {
        PassengerWaggon passengerWaggon = new PassengerWaggon();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong.equals(id)) {
                        passengerWaggon.setId(firstLong);
                        passengerWaggon.setTypeOfWagoonComfort(splitedLine[1]);
                        passengerWaggon.setQuantityOfSeats(Integer.parseInt(splitedLine[2]));

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return passengerWaggon;
    }
   @Override
    public void saveEntity(PassengerWaggon passengerWaggon) {
        String passengerWaggonToString = passengerWaggon.getId() + "," +
                passengerWaggon.getTypeOfWagoonComfort() + "," +
                passengerWaggon.getQuantityOfSeats();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(passengerWaggonToString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(PassengerWaggon passengerWaggon) {
        removeEntity(passengerWaggon);
        saveEntity(passengerWaggon);
    }

    @Override
    public ArrayList<PassengerWaggon> removeEntity(PassengerWaggon passengerWaggon) {try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String read = null;
        while ((read = reader.readLine()) != null) {
            String[] splitedFile = read.split("/");
            for (String line : splitedFile) {
                String[] splitedLine = line.split(",");

                Long firstLong = Long.parseLong(splitedLine[0]);

                if (firstLong == passengerWaggon.getId()) {
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

        return null;
    }
    public ArrayList<PassengerWaggon> getAllEntities() {
        ArrayList<PassengerWaggon> passengerWaggons= new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    PassengerWaggon passengerWaggon = new PassengerWaggon();

                    passengerWaggon.setId(Long.parseLong(splitedLine[0]));
                    passengerWaggon.setTypeOfWagoonComfort(splitedLine[1]);
                    passengerWaggon.setQuantityOfSeats(Integer.parseInt(splitedLine[2]));


                    passengerWaggons.add(passengerWaggon);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return passengerWaggons;

    }


}






