package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.PassengerController;
import com.cbsgenesis.trainsmanagementsystem.controller.TicketController;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andrey Babenko
 */
public class PassengerView {
    PassengerController passengerController = new PassengerController();
    TicketController ticketController = new TicketController();

    public void showPassengerMenu() {
        System.out.println("========== PASSENGERS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new passenger");
        System.out.println("2 - Find a passenger");
        System.out.println("3 - View all passengers");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;

        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createTicketMenu();
                    break;
                case 2:
                    findPassengerMenu();
                    break;
                case 3:
                    viewAllPassengers();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please chose from the list.");
            }
        }
    }

    public void createTicketMenu() {
        Passenger passenger = new Passenger();

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== CREATE NEW PASSENGER ==========\n");

        while (passenger.getId() == null) {
            System.out.println("Enter passenger ID:");
            Long tempId = scanner.nextLong();
            if (passengerController.getEntityById(tempId).getId() != null) {
                System.out.println("Passenger with such ID is already existed. Please enter another ID.");
            } else {
                passenger.setId(tempId);
            }
        }

        scanner = new Scanner(System.in);

        while (passenger.getFirstName() == null || passenger.getFirstName().isEmpty()) {
            System.out.println("Enter passenger first name:");
            passenger.setFirstName(scanner.nextLine());

        }
        while (passenger.getLastName() == null || passenger.getLastName().isEmpty()) {
            System.out.println("Enter passenger last name:");
            passenger.setLastName(scanner.nextLine());
        }

        while (passenger.getTicketId() == null) {
            System.out.println("Enter passenger's ticket ID:");
            Long tempId = scanner.nextLong();
            if (ticketController.getEntityById(tempId).getId() == null) {
                System.out.println("There is no ticket with such ID");
            } else {
                passenger.setTicketId(tempId);
            }
        }

        passengerController.saveEntity(passenger);
        System.out.println();

        System.out.println("========== PASSENGERS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new passenger");
        System.out.println("2 - Find a passenger");
        System.out.println("3 - View all passengers");
        System.out.println("0 - Move to previous menu");
    }

    public void findPassengerMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== FIND A PASSENGER ==========\n");
        System.out.println("Enter passenger ID to start search or enter 0 to move to previous menu:");
        Long tempId = scanner.nextLong();

        Passenger passenger = passengerController.getEntityById(tempId);

        if (passenger.getId() == null) {
            System.out.println("There is no passenger with such ID");
        } else {
            showPassengerInfo(passenger);
        }

        System.out.println("========== PASSENGERS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new passenger");
        System.out.println("2 - Find a passenger");
        System.out.println("3 - View all passengers");
        System.out.println("0 - Move to previous menu");
    }

    public void showPassengerInfo(Passenger passenger){
        System.out.println("=== PASSENGER #" + passenger.getId() + " ===\n");
        System.out.println("First name: " + passenger.getFirstName());
        System.out.println("Last name: " + passenger.getLastName());
        System.out.println("Passenger's ticket ID: " + passenger.getTicketId());
        System.out.println();
    }

    public void viewAllPassengers() {
        ArrayList<Passenger> passengers = passengerController.getAllEntities();

        for (int i = 0; i<passengers.size(); i++) {
            showPassengerInfo(passengers.get(i));
        }

        System.out.println("========== PASSENGERS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new passenger");
        System.out.println("2 - Find a passenger");
        System.out.println("3 - View all passengers");
        System.out.println("0 - Move to previous menu");
    }
}
