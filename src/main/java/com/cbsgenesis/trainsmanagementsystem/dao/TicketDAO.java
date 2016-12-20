package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Implementation of {@link GenericDAO} interface for class {@link Ticket}.
 *
 * @author Andrey Babenko
 */
public class TicketDAO implements GenericDAO<Ticket> {
    String filePath = "src/resources/database_test/tickets.txt";

    @Override
    public Ticket getEntityById(Long id) {
        Ticket ticket = new Ticket();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong.equals(id)) {
                        ticket.setId(firstLong);
                        ticket.setFirstName(splitedLine[1]);
                        ticket.setLastName(splitedLine[2]);
                        ticket.setTypeOfWagoon(splitedLine[3]);
                        ticket.setPlace(Integer.parseInt(splitedLine[4]));
                        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);
                        ticket.setDepartureDate(dateFormat.parse(splitedLine[5]));
                        ticket.setArriveDate(dateFormat.parse(splitedLine[6]));
                        ticket.setBed(Boolean.parseBoolean(splitedLine[7]));
                        ticket.setTea(Integer.parseInt(splitedLine[8]));
                        ticket.setCoffee(Integer.parseInt(splitedLine[9]));
                        ticket.setBaggage(Integer.parseInt(splitedLine[10]));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ticket;
    }

    @Override
    public void saveEntity(Ticket ticket) {
        Ticket existingTicket = getEntityById(ticket.getId());

        if (ticket.getId().equals(existingTicket.getId())) {
            System.err.println("Ticket with such id is already existing");
        } else {
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                StringBuilder existingFile = new StringBuilder();
                String read;

                while ((read = reader.readLine()) != null) {
                    existingFile.append(read);
                }

                String tempFileData = existingFile.toString();
                String [] tempFileDataList = tempFileData.split("/");

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

                String newFile = "";

                if (existingFile.toString().equals("")) {
                    newFile = existingFile.append(ticketToString).toString();
                } else {
                    for (int i = 0; i < tempFileDataList.length; i++) {
                        newFile += tempFileDataList[i];
                        newFile += "/";
                        newFile += "\n";
                    }
                    newFile += ticketToString;
                }

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(newFile);
                }catch (IOException e){
                    e.printStackTrace();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateEntity(Ticket ticket) {
        removeEntity(ticket);

        saveEntity(ticket);
    }

    @Override
    public void removeEntity(Ticket ticket) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong.equals(ticket.getId())) {
                        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                            writer.write("");
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Ticket> getAllEntities() {
        ArrayList<Ticket> tickets = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {


            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Ticket ticket = new Ticket();

                    ticket.setId(Long.parseLong(splitedLine[0]));
                    ticket.setFirstName(splitedLine[1]);
                    ticket.setLastName(splitedLine[2]);
                    ticket.setTypeOfWagoon(splitedLine[3]);
                    ticket.setPlace(Integer.parseInt(splitedLine[4]));
                    DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);
                    ticket.setDepartureDate(dateFormat.parse(splitedLine[5]));
                    ticket.setArriveDate(dateFormat.parse(splitedLine[6]));
                    ticket.setBed(Boolean.parseBoolean(splitedLine[7]));
                    ticket.setTea(Integer.parseInt(splitedLine[8]));
                    ticket.setCoffee(Integer.parseInt(splitedLine[9]));
                    ticket.setBaggage(Integer.parseInt(splitedLine[10]));

                    tickets.add(ticket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return tickets;

    }
}
