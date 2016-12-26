package com.cbsgenesis.trainsmanagementsystem.view;

/**
 * Class that stores method that output text messages for User and connect View with Controller layer.
 *
 * @author Eugene Suleimanov
 * @author Andrey Babenko
 */

public class ConsoleHelper {
    TicketView ticketView = new TicketView();
    PassengerView passengerView = new PassengerView();

    public TicketView getTicketView() {
        return ticketView;
    }

    public PassengerView getPassengerView() {
        return passengerView;
    }
}
