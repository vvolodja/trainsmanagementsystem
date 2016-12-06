package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Ticket}.
 *
 * Created by Andrey Babenko on 12/6/16.
 */
public class TicketDAO implements GenericDAO<Ticket> {
    @Override
    public Ticket getEntityById(Long id) {
        Ticket ticket = new Ticket();

        try(BufferedReader reader = new BufferedReader(new FileReader("src/resources/database_test/tickets.txt"))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == id) {
                        ticket.setId(firstLong);
                        ticket.setFirstName(splitedLine[1]);
                        ticket.setLastName(splitedLine[2]);
                        ticket.setTypeOfWagoon(splitedLine[3]);
                        ticket.setPlace(Integer.parseInt(splitedLine[4]));

                        DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm", Locale.ENGLISH);
                        ticket.setDepartureDate();

                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ticket;
    }

    @Override
    public void saveEntity(Ticket ticket) {
        String ticketToString = ticket.getId() + "," +
                ticket.getFirstName() + "," +
                ticket.getLastName() + "," +
                ticket.getTypeOfWagoon() + "," +
                ticket.getPlace() + "," +
                ticket.getDepartureDate() + "," +
                ticket.getArriveDate() + "," +
                ticket.isBed() + "," +
                ticket.getTea() + "," +
                ticket.getCoffee() + "," +
                ticket.getBaggage() + "/";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/database_test/tickets.txt"))) {
            writer.write(ticketToString);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Ticket ticket) {

    }

    @Override
    public void removeEntity(Ticket ticket) {

    }
}
