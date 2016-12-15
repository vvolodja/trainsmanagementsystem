package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Station;

import java.io.*;
import java.util.Arrays;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Station}
 *
 * @author Eugene Suleimanov
 * @author Julia Konoh
 */
public class StationDAO implements GenericDAO<Station> {
    String filePath = "src/resources/database_test/stations.txt";

    @Override
    public Station getEntityById(Long id) {
        Station station = new Station();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;

            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");
                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong.equals(id)) {


                        station.setId(firstLong);
                        station.setName(splitedLine[1]);
                        station.setDescription(splitedLine[2]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return station;
    }

    @Override
    public void saveEntity(Station station) {

        Station existingStation = getEntityById(station.getId());

        if (station.getId().equals(existingStation.getId())) {
            System.err.println("Station with such id is already existing");
        } else {

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                StringBuilder existingFile = new StringBuilder();
                String read;

                while ((read = reader.readLine()) != null) {
                    existingFile.append(read);
                }

                String stationToString = station.getId() + "," +
                        station.getId() + "," +
                        station.getName() + "," +
                        station.getDescription();
                String newFile;
                if (existingFile.toString().equals("")) {
                    newFile = existingFile.append(stationToString).toString();
                } else {
                    newFile = existingFile.append("\n").append(stationToString).toString();
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(newFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateEntity(Station station) {
        removeEntity(station);
        saveEntity(station);
    }


    @Override
    public void removeEntity(Station station) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong.equals(station.getId())) {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                            writer.write("");
                        } catch (IOException e) {
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