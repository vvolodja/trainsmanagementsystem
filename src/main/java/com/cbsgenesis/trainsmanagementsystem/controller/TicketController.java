package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.TicketDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.util.ArrayList;

/**
 * Controller for class {@link Ticket}
 *
 * @author  Andrey Babenko
 */
public class TicketController {
    TicketDAO ticketDAO = new TicketDAO();

    public Ticket getEntityById(Long id){
        return ticketDAO.getEntityById(id);
    }

    public void saveEntity(Ticket ticket) {
        ticketDAO.saveEntity(ticket);
    }

    public void updateEntity(Ticket ticket){
        ticketDAO.updateEntity(ticket);
    }

    public void removeEntity(Ticket ticket) {
        ticketDAO.removeEntity(ticket);
    }

    public ArrayList<Ticket> getAllEntities() {
        return ticketDAO.getAllEntities();
    }
}
