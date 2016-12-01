package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

/**
 * Created by Java on 01.12.2016.
 */
public class LocomotiveDAO implements GenericDAO<Locomotive> {
    @Override
    public Locomotive getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Locomotive locomotive) {
        String locomotiveToString = locomotive.getId()+ ","
                + locomotive.getName()+ "," + locomotive.getCapacity() + ","
                + locomotive.getPower()+ ","+ locomotive.getYearOfIssue()+ ","
                + locomotive.getFuelType()+ ","+locomotive.getLastServiceDate()+"/";
    }

    @Override
    public void updateEntity(Locomotive locomotive) {
        String locomotiveToString = locomotive.getId()+ ","
                + locomotive.getName()+ "," + locomotive.getCapacity() + ","
                + locomotive.getPower()+ ","+ locomotive.getYearOfIssue()+ ","
                + locomotive.getFuelType()+ ","+locomotive.getLastServiceDate()+"/";
    }

    @Override
    public void removeEntity(Locomotive locomotive) {
        String locomotiveToString = locomotive.getId()+ ","
                + locomotive.getName()+ "," + locomotive.getCapacity() + ","
                + locomotive.getPower()+ ","+ locomotive.getYearOfIssue()+ ","
                + locomotive.getFuelType()+ ","+locomotive.getLastServiceDate()+"/";
    }
}
