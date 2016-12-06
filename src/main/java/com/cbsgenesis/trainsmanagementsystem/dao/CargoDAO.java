package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Евгений on 06.12.2016.
 */
public class CargoDAO implements GenericDAO<Cargo> {

    @Override
    public Cargo getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Cargo cargo) {
        String cargoToString = cargo.getType() + "," + cargo.getVolume() + "," + cargo.getWeight() + "," + cargo.getDimension() + "," + cargo.getQuatityOfCars() + "/";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/beClever/IdeaProjects/TrainsManagementSystem/src/resources/database_production/cargo.txt"))) {
            writer.write(cargoToString);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @Override
    public void updateEntity(Cargo cargo) {String cargoToString = cargo.getType() + "," + cargo.getVolume() + "," + cargo.getWeight() + "," + cargo.getDimension() + "," + cargo.getQuatityOfCars() + "/";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/beClever/IdeaProjects/TrainsManagementSystem/src/resources/database_production/cargo.txt"))) {
            writer.write(cargoToString);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @Override
    public void removeEntity(Cargo cargo) {String cargoToString = cargo.getType() + "," + cargo.getVolume() + "," + cargo.getWeight() + "," + cargo.getDimension() + "," + cargo.getQuatityOfCars() + "/";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/beClever/IdeaProjects/TrainsManagementSystem/src/resources/database_production/cargo.txt"))) {
            writer.write(cargoToString);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
