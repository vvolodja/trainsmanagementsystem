package com.cbsgenesis.trainsmanagementsystem;

import com.cbsgenesis.trainsmanagementsystem.view.ConsoleHelper;

import java.text.ParseException;

/**
 * Main class of TrainManagementSystem application.
 *
 */

public class TMSRunner {
    public static void main(String[] args) throws ParseException {
        ConsoleHelper consoleHelper = new ConsoleHelper();


        //consoleHelper.showTicketMenu();

        consoleHelper.getPassengerView().showPassengerMenu();

    }
}
