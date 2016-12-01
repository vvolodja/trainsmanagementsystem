package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple class that represents passenger
 *
 * Created by andreyb1990 on 12/1/16.
 */
public class Passenger extends NamedEntity {
    private Ticket ticket;

    public Passenger() {
    }

    public Passenger(String name) {
        super(name);
    }

    public Passenger(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + super.getName() +
                "ticket=" + ticket +
                '}';
    }
}
