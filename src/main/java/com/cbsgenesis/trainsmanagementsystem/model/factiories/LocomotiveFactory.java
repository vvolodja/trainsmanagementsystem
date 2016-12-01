package com.cbsgenesis.trainsmanagementsystem.model.factiories;

import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

/**
 * Created by Java on 01.12.2016.
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
