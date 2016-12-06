package com.cbsgenesis.trainsmanagementsystem.model.factiories;

import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;
import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Implementation of {@link EntityFactory} interface for class {@link Station}.
 *
 * @author Eugenij Lukashik
 */
public class LocomotiveFactory implements EntityFactory<Locomotive> {


    @Override
    public Locomotive createEntity() {
        return new Locomotive();
    }

    @Override
    public Locomotive createEntity(String parameter) {
        return new Locomotive();
    }
}
