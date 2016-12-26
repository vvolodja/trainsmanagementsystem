package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.TicketController;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Andrey Babenko
 */
public class TicketView {
    TicketController ticketController = new TicketController();

    public void showTicketMenu() throws ParseException {
        System.out.println("========== TICKETS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new ticket");
        System.out.println("2 - Find a ticket");
        System.out.println("3 - View all tickets");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;

        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        createTicketMenu();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    findTicketMenu();
                    break;
                case 3:
                    viewAllTickets();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please chose from the list.");
            }
        }
    }

    public void createTicketMenu() throws ParseException {
        Ticket ticket = new Ticket();
        ticket.setTea(-1);
        ticket.setCoffee(-1);
        ticket.setBaggage(-1);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== CREATE NEW TICKET ==========\n");

        while (ticket.getId() == null) {
            System.out.println("Enter ticket ID:");
            Long tempId = scanner.nextLong();
            if (ticketController.getEntityById(tempId).getId() != null) {
                System.out.println("Ticket with such ID is already existed. Please enter another ID.");
            } else {
                ticket.setId(tempId);
            }
        }

        scanner = new Scanner(System.in);

        while (ticket.getFirstName() == null || ticket.getFirstName().isEmpty()) {
            System.out.println("Enter passenger first name:");
            ticket.setFirstName(scanner.nextLine());

        }
        while (ticket.getLastName() == null || ticket.getLastName().isEmpty()) {
            System.out.println("Enter passenger last name:");
            ticket.setLastName(scanner.nextLine());
        }
        while (ticket.getTypeOfWagoon() == null || ticket.getTypeOfWagoon().isEmpty()) {
            System.out.println("Enter type of wagoon:");
            ticket.setTypeOfWagoon(scanner.nextLine());
        }
        while (ticket.getPlace() == 0) {
            System.out.println("Enter place from 1 to 54:");
            ticket.setPlace(scanner.nextInt());
            if (ticket.getPlace() instanceof Integer || ticket.getPlace() < 55) {
                continue;
            } else {
                ticket.setPlace(0);
                System.out.println("There is no such place in wagoon. Please select place from 1 to 54");
            }
        }

        scanner = new Scanner(System.in);

        while (ticket.getDepartureDate() == null) {
            System.out.println("Enter departure date:");
            ticket.setDepartureDate(dateFormat.parse(scanner.nextLine()));
        }
        while (ticket.getArriveDate() == null) {
            System.out.println("Enter arrive date:");
            ticket.setArriveDate(dateFormat.parse(scanner.nextLine()));
        }
        while (!ticket.isBed()) {
            System.out.println("Does passenger need a bed? Y/N");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Y")) {
                ticket.setBed(true);
            } else if (answer.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("This is no such option. Please enter 'Y' or 'N'");
            }
        }
        while (ticket.getTea() < 0) {
            System.out.println("How many cups of tea passenger needed?");
            ticket.setTea(scanner.nextInt());
            if (ticket.getTea() instanceof Integer || ticket.getTea() > -1) {
                continue;
            } else {
                ticket.setTea(-1);
                System.out.println("Wrong value. Number of tea cups must be greater or equal to zero.");
            }
        }
        while (ticket.getCoffee() < 0) {
            System.out.println("How many cups of coffee passenger needed?");
            ticket.setCoffee(scanner.nextInt());
            if (ticket.getCoffee() instanceof Integer || ticket.getCoffee() > -1) {
                continue;
            } else {
                ticket.setCoffee(-1);
                System.out.println("Wrong value. Number of coffee cups must be greater or equal to zero.");
            }
        }
        while (ticket.getBaggage() < 0) {
            System.out.println("Enter baggage weight:");
            ticket.setBaggage(scanner.nextInt());
            if (ticket.getBaggage() instanceof Integer || ticket.getBaggage() > -1) {
                continue;
            } else {
                ticket.setBaggage(-1);
                System.out.println("Wrong value. Weight of baggage can be greater or equal to zero.");
            }
        }

        ticketController.saveEntity(ticket);

        System.out.println("New ticket have been successfully added");
        System.out.println();

        System.out.println("========== TICKETS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new ticket");
        System.out.println("2 - Find a ticket");
        System.out.println("3 - View all tickets");
        System.out.println("0 - Move to previous menu");
    }

    public void findTicketMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== FIND A TICKET ==========\n");
        System.out.println("Enter ticket ID to start search or enter 0 to move to previous menu:");
        Long tempId = scanner.nextLong();

        Ticket ticket = ticketController.getEntityById(tempId);

        if (ticket.getId() == null) {
            System.out.println("There is no ticket with such ID");
        } else {
            showTicketInfo(ticket);
        }

        System.out.println("========== TICKETS ==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new ticket");
        System.out.println("2 - Find a ticket");
        System.out.println("3 - View all tickets");
        System.out.println("0 - Move to previous menu");
    }

    public void showTicketInfo(Ticket ticket){
        System.out.println("=== TICKET #" + ticket.getId() + " ===\n");
        System.out.println("First name: " + ticket.getFirstName());
        System.out.println("Last name: " + ticket.getLastName());
        System.out.println("Type of wagoon: " + ticket.getTypeOfWagoon());
        System.out.println("Place: " + ticket.getPlace());
        System.out.println("Departure date: " + ticket.getDepartureDate());
        System.out.println("Arrive date: " + ticket.getArriveDate());
        if (ticket.isBed()) {
            System.out.println("Bed: YES");
        } else {
            System.out.println("Bed: NO");
        }
        System.out.println("Number of tea cups: " + ticket.getTea());
        System.out.println("Numbers of coffee cups: " + ticket.getCoffee());
        System.out.println("Baggage weight: " + ticket.getBaggage());
        System.out.println();
    }

    public void viewAllTickets() {
        ArrayList<Ticket> tickets = ticketController.getAllEntities();

        for (int i = 0; i<tickets.size(); i++) {
            showTicketInfo(tickets.get(i));
        }

        System.out.println("==========TICKETS==========\n");
        System.out.println("Select option:");
        System.out.println("1 - Create new ticket");
        System.out.println("2 - Find a ticket");
        System.out.println("3 - View all tickets");
        System.out.println("0 - Move to previous menu");
    }
}
