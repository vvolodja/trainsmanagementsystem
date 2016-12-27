package com.cbsgenesis.trainsmanagementsystem.model.factiories;

import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Implementation of {@link EntityFactory} interface for class {@link Station}.
 *
 * @author Eugene Suleimanov
 */
public class StationFactory implements EntityFactory<Station>{
    @Override
    public Station createEntity() {

        return new Station();
    }

    @Override
    public Station createEntity(String parameter) {
        return new Station() ;
    }
}
