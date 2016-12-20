package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.FreightWagoonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.FreightWagoon;

import java.util.ArrayList;

/**
 * Created by Java on 20.12.2016.
 */
public class FreightWagoonController {
    private FreightWagoonDAO freightWagoonDAO = new FreightWagoonDAO();

    private ArrayList<FreightWagoon> getALLEntities(){ return freightWagoonDAO.getAllEntities();}

}
