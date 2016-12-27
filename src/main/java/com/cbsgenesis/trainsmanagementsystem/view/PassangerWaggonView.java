package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.PassengerController;
import com.cbsgenesis.trainsmanagementsystem.controller.PassengerWagoonController;
import com.cbsgenesis.trainsmanagementsystem.controller.TicketController;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;
import com.cbsgenesis.trainsmanagementsystem.model.PassengerWaggon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Julia Konoh;
 */
public class PassangerWaggonView {
    PassengerWagoonController passengerWagoonController = new PassengerWagoonController();
    TicketController ticketController = new TicketController();

    public void showPassengerWagoonMenu() {
        System.out.println("========== PASSENGER WAGOONS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new Passenger Wagoon");
        System.out.println("2 - Find a Passenger Wagoon");
        System.out.println("3 - View all Passenger Wagoon");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;

        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    findPassengerWaggonMenu();
                    break;
                case 3:
                    viewAllPassengerWagoon();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please choose from the list.");
            }
        }
    }

    public void createTicketMenu() {
        PassengerWaggon passengerWaggon = new PassengerWaggon();
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== CREATE NEW PASSENGER WAGOON ==========\n");

        while (passengerWaggon.getId() == null) {
            System.out.println("Enter Passenger Wagoon ID:");
            Long tempId = scanner.nextLong();
            if (passengerWagoonController.getEntityById(tempId).getId() != null) {
                System.out.println("Passenger wagoon with such ID is already existed. Please enter another ID.");
            } else {
                passengerWaggon.setId(tempId);
            }
        }

        scanner = new Scanner(System.in);

        while (passengerWaggon.getTypeOfWagoonComfort() == null || passengerWaggon.getTypeOfWagoonComfort().isEmpty()) {
            System.out.println("Enter Passenger Wagoon type of wagoon comfort:");
            passengerWaggon.setTypeOfWagoonComfort(scanner.nextLine());

        }
        while (passengerWaggon.getQuantityOfSeats() == null || passengerWaggon.getQuantityOfSeats().isEmpty()) {
            System.out.println("Enter Passenger Wagoon quantity of seats:");
            passengerWaggon.setQuantityOfSeats(scanner.nextLine());
        }

        while (passengerWaggon.getTicketId() == null) {
            System.out.println("Enter passenger's ticket ID:");
            Long tempId = scanner.nextLong();
            if (ticketController.getEntityById(tempId).getId() == null) {
                System.out.println("There is no ticket with such ID");
            } else {
                passengerWaggon.setTicketId(tempId);
            }
        }

        passengerWagoonController.saveEntity(passengerWaggon);
        System.out.println();

        System.out.println("========== PASSENGERS WAGOONS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new passenger");
        System.out.println("2 - Find a passenger");
        System.out.println("3 - View all passengers");
        System.out.println("0 - Move to previous menu");
    }

    public void findPassengerWaggonMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== FIND A PASSENGER WAGOON ==========\n");
        System.out.println("Enter Passenger Wagoon ID to start search or enter 0 to move to previous menu:");
        Long tempId = scanner.nextLong();

        PassengerWaggon passengerWaggon = passengerWagoonController.getEntityById(tempId);

        if (passengerWaggon.getId() == null) {
            System.out.println("There is no Passenger Wagoon with such ID");
        } else {
            showPassengerWagoonInfo(passengerWaggon);
        }

        System.out.println("========== PASSENGERS WAGOONS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new Passenger Wagoons");
        System.out.println("2 - Find a Passenger Wagoon");
        System.out.println("3 - View all Passenger Wagoon");
        System.out.println("0 - Move to previous menu");
    }

    public void showPassengerWagoonInfo(PassengerWaggon passengerWaggon) {
        System.out.println("=== PASSENGER WAGOON #" + passengerWaggon.getId() + " ===\n");
        System.out.println("Type of wagoon comfort: " + passengerWaggon.getTypeOfWagoonComfort());
        System.out.println("Quantity of seats: " + passengerWaggon.getQuantityOfSeats());
        System.out.println("Passenger's ticket ID: " + passenger.getTicketId());
        System.out.println();
    }

    public void viewAllPassengerWagoon() {
        ArrayList<PassengerWaggon> passengerWaggons = passengerWagoonController.getAllEntities();

        for (int i = 0; i < passengerWaggons.size(); i++) {
            showPassengerWagoonInfo();
            Info(passengerWaggons.get(i));
        }

        System.out.println("========== PASSENGER WAGOONS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new Passenger Wagoon");
        System.out.println("2 - Find a Passenger Wagoon");
        System.out.println("3 - View all Passenger Wagoon");
        System.out.println("0 - Move to previous menu");
    }


}