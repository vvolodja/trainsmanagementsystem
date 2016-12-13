package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

import java.io.*;

/** create CargoDAO
 * @Eugeny Nenenko on 06.12.2016.
 */
public class CargoDAO implements GenericDAO<Cargo> {

    String filePath = "Users/beClever/IdeaProjects/TrainsManagementSystem/src/resources/database_test/cargo.txt";


    @Override
    public Cargo getEntityById(Long id) {

        Cargo cargo = new Cargo();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == id) {
                        cargo.setId(firstLong);
                        cargo.setType(splitedLine[1]);
                        cargo.setVolume(Integer.parseInt(splitedLine[2]));
                        cargo.setWeight(Integer.parseInt(splitedLine[3]));
                        cargo.setDimension(Integer.parseInt(splitedLine[4]));
                        cargo.setQuantityOfCars(Integer.parseInt(splitedLine[5]));


                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return cargo;
    }


    @Override
    public void saveEntity(Cargo cargo) {
        String cargoToString = cargo.getId() + "," +
                cargo.getType() + "," +
                cargo.getVolume() + "," +
                cargo.getWeight() + "," +
                cargo.getDimension() + "," +
                cargo.getQuantityOfCars() + "/";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(cargoToString);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @Override
    public void updateEntity(Cargo cargo) {
        removeEntity(cargo);

        saveEntity(cargo);

    }

    @Override
    public void removeEntity(Cargo cargo) {try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String read = null;
        while ((read = reader.readLine()) != null) {
            String[] splitedFile = read.split("/");
            for (String line : splitedFile) {
                String[] splitedLine = line.split(",");

                Long firstLong = Long.parseLong(splitedLine[0]);

                if (firstLong == cargo.getId()) {
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
