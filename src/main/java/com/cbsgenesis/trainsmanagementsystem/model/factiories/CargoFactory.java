package com.cbsgenesis.trainsmanagementsystem.model.factiories;

import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

/** create factory of cargo
 * @Eugeny Neneneko
 * Created by Java on 01.12.2016.
 */
public class CargoFactory implements EntityFactory<Cargo> {
    @Override
    public Cargo createEntity() {
        return new Cargo();
    }

    @Override
    public Cargo createEntity(String parameter) {
        return new Cargo();
    }
}
