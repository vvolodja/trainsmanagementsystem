package com.cbsgenesis.trainsmanagementsystem.model;

import com.cbsgenesis.trainsmanagementsystem.dao.TicketDAO;

/**
 * Simple class that represents passenger
 *
 * Created by Andrey Babenko on 12/1/16.
 */
public class Passenger extends BaseEntity {
    private String firstName;
    private String lastName;
    private Long ticketId;

    public Passenger() {
    }

    public Passenger(String firstName, String lastName, Long ticketId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketId = ticketId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticketId=" + ticketId +
                '}';
    }
}
