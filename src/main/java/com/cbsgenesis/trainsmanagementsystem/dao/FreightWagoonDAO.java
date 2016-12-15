package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.FreightWagoon;
import com.cbsgenesis.trainsmanagementsystem.model.Wagoon;

import java.io.*;

/**
 * Created by Java on 15.12.2016.
 */
public class FreightWagoonDAO implements GenericDAO<FreightWagoon> {

    String filePath = "src/resources/database_test/frightWagoon.txt";

    @Override
    public FreightWagoon getEntityById(Long id) {
        FreightWagoon freightWagoon = new FreightWagoon();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == id) {
                        freightWagoon.setId(firstLong);
                        freightWagoon.setTypeOfCargoForWagoon(splitedLine[1]);
                        freightWagoon.setWeight(Integer.parseInt(splitedLine[2]));
                        freightWagoon.setDimension(Integer.parseInt(splitedLine[3]));

                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return freightWagoon;

    }


    @Override
    public void saveEntity(FreightWagoon freightWagoon) {

        String freightWagoonToString = freightWagoon.getId() + "," + freightWagoon.getTypeOfCargoForWagoon() + "," + freightWagoon.getWeight() + "," + freightWagoon.getDimension()  +  "/";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(freightWagoonToString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void updateEntity(FreightWagoon freightWagoon) {

        removeEntity(freightWagoon);
        saveEntity(freightWagoon);

    }

    @Override
    public void removeEntity(FreightWagoon freightWagoon) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == freightWagoon.getId()) {
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

