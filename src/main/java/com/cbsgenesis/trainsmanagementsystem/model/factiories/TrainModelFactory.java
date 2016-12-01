package com.cbsgenesis.trainsmanagementsystem.model.factiories;

import com.cbsgenesis.trainsmanagementsystem.model.TrainModel;

/**
 * Implementation of {@link EntityFactory} interface for class {@link TrainModel}.
 *
 * Created by andreyb1990 on 12/1/16.
 */
public class TrainModelFactory implements EntityFactory<TrainModel> {


    @Override
    public TrainModel createEntity() {
        return new TrainModel();
    }

    @Override
    public TrainModel createEntity(String parameter) {
        return new TrainModel();
    }
}
