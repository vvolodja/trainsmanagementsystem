package com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.dao.TicketDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.util.ArrayList;

/**
 * Controller for class {@link Ticket}
 *
 * @author  Andre Babenko
 */
public class TicketController {
    TicketDAO ticketDAO = new TicketDAO();

    public ArrayList<Ticket> showAllTickets() {
        return ticketDAO.getAllEntitys();
    }
}
