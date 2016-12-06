package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Station;

import java.io.*;
import java.util.Arrays;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Station}
 *
 * @author Eugene Suleimanov
 *
 *
 * not over j.konoh
 *
 */
public class StationDAO implements GenericDAO<Station> {

    @Override
    public Station getEntityById(Long id) {
        Station station = new Station();

        try (BufferedReader br = new BufferedReader(new FileReader("src/resources/database_test/stations.txt"))) {
            //чтение построчно
            String allFileRecords;
            Long stationId = 0L;
            String stationName = "";
            String stationDescription = "";

            station.setId(stationId);
            station.setName(stationName);
            station.setDescription(stationDescription);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return station;


    }

    @Override
    public void saveEntity(Station station) {
        String stationToString = station.getId() + "," + station.getName() + "," + station.getDescription() + "/";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/database_test/stations.txt"))) {
            writer.write(stationToString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Station entity) {

    }

    @Override
    public void removeEntity(Station entity) {

    }
}
/*
* ufferedWriter writer = null;
try
{
    writer = new BufferedWriter( new FileWriter( yourfilename));
    writer.write( yourstring);

}
catch ( IOException e)
{
}
finally
{
    try
    {
        if ( writer != null)
        writer.close( );
    }
    catch ( IOException e)
    {
    }
}

* */