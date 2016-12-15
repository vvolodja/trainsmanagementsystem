package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.PassengerController;
import com.cbsgenesis.trainsmanagementsystem.controller.TicketController;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class that stores method that output text messages for User and connect View with Controller layer.
 *
 * @author Eugene Suleimanov
 * @author Andrey Babenko
 */

public class ConsoleHelper {
    TicketController ticketController = new TicketController();
    PassengerController passengerController = new PassengerController();

    public void showTicketMenu() throws ParseException {
        System.out.println("==========TICKETS==========\n");
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
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please chose from the list.");
            }
        }
    }

    private void createTicketMenu() throws ParseException {
        Ticket ticket = new Ticket();
        ticket.setTea(-1);
        ticket.setCoffee(-1);
        ticket.setBaggage(-1);

        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========CREATE NEW TICKET==========\n");
        while (ticket.getId() == null) {
            System.out.println("Enter ticket ID:");
            Ticket tempTicket;
            Long tempId = scanner.nextLong();
            tempTicket = ticketController.getEntityById(tempId);
            System.out.println(tempTicket);
            if (tempTicket != null) {
                System.out.println("Ticket with such ID is already existed. Please enter another ID.");
            } else {
                ticket.setId(tempId);
            }
        }
        while (ticket.getFirstName().isEmpty() || ticket.getFirstName() == null) {
            System.out.println("Enter passenger first name:");
            ticket.setFirstName(scanner.nextLine());
        }
        while (ticket.getLastName().isEmpty() || ticket.getLastName() == null) {
            System.out.println("Enter passenger last name:");
            ticket.setLastName(scanner.nextLine());
        }
        while (ticket.getTypeOfWagoon().isEmpty() || ticket.getTypeOfWagoon() == null) {
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
        while (ticket.getDepartureDate() == null) {
            System.out.println("Enter departure date:");
            ticket.setDepartureDate(dateFormat.parse(scanner.nextLine()));
        }
        while (ticket.getArriveDate() == null) {
            System.out.println("Enter arrive date:");
            ticket.setDepartureDate(dateFormat.parse(scanner.nextLine()));
        }
        while (!ticket.isBed()) {
            System.out.println("Does passenger need a bed? Y/N");
            if (scanner.nextLine() == "Y") {
                ticket.setBed(true);
            } else if (scanner.nextLine() == "N") {
                ticket.setBed(false);
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
    }
}
