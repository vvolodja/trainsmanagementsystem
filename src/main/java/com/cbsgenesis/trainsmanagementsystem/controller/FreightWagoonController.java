package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.FreightWagoonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.FreightWagoon;

import java.util.ArrayList;

/**
 * Created by Java on 20.12.2016.
 */
public class FreightWagoonController {
    private FreightWagoonDAO freightWagoonDAO = new FreightWagoonDAO();

    public ArrayList<FreightWagoon> getALLEntities(){ return freightWagoonDAO.getAllEntities();}

    public FreightWagoon getEntityById(Long Id){return freightWagoonDAO.getEntityById(Id);}

    public void saveEntity(FreightWagoon freightWagoon){freightWagoonDAO.saveEntity(freightWagoon);}

    public void updateEntity(FreightWagoon freightWagoon){freightWagoonDAO.updateEntity(freightWagoon);}

    public void removeEntity(FreightWagoon freightWagoon){freightWagoonDAO.removeEntity(freightWagoon);}

}
