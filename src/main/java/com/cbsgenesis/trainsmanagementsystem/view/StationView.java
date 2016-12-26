package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.StationController;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;
import com.cbsgenesis.trainsmanagementsystem.model.Station;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Евгений on 26.12.2016.
 */
public class StationView {
    StationController stationController =new StationController();

    public void showStationoMenu() throws ParseException {

        System.out.println("==================CREATE NEW STATION=====================");
        System.out.println("Select option:");
        System.out.println("1 - Create new Station");
        System.out.println("2 - Find a Station");
        System.out.println("3 - View all Stations");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;
        System.out.println("==========STATION==========\n");

        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        createStationMenu();
                    } catch (ParseException e) {
                        e.getStackTrace();
                    }
                    break;
                case 2:
                    findStationMenu();
                    break;
                case 3:
                    viewAllStation();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please chose from the list.");
            }
        }
    }

        private void createStationMenu ()throws ParseException {
            Station station = new Station();

            station.setName("");
            station.setDescription("");

            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);

            Scanner scanner = new Scanner(System.in);

            System.out.println("===============CREATE STATION===============");

            while (station.getId() == null) {
                System.out.println("Enter station Id ");
                Long tempId = scanner.nextLong();
                if (stationController.getEntityById(tempId) != null) {
                    System.out.println("Ticket with such ID is already existed. Please enter another ID.");
                } else {
                    station.setId(tempId);
                }
            }
            scanner = new Scanner(System.in);

            while (station.getName() == null) {
                System.out.println("Enter type of station:");
                station.setName(scanner.nextLine());
            }


            stationController.saveEntity(station);
            System.out.println("New station have been successfully added");
            System.out.println();


            System.out.println("==================STATIONS=====================");
            System.out.println("Select option:");
            System.out.println("1 - Create new Station");
            System.out.println("2 - Find a Station");
            System.out.println("3 - View all Stations");
            System.out.println("0 - Move to previous menu");
        }
    public void findStationMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== FIND A STATION ==========\n");
        System.out.println("Enter ticket ID to start search or enter 0 to move to previous menu:");
        Long tempId = scanner.nextLong();
       Station station = stationController.getEntityById(tempId);
        if (station.getId() == null) {
            System.out.println("There is no station with such ID");
        } else {
            showStationInfo(station);
        }
        System.out.println("==================STATIONS=====================");
        System.out.println("Select option:");
        System.out.println("1 - Create new cargo");
        System.out.println("2 - Find a cargo");
        System.out.println("3 - View all cargos");
        System.out.println("0 - Move to previous menu");
    }

    public void showStationInfo(Station station) {
        System.out.println("=== Cargo #" + station.getId() + " ===\n");
        System.out.println("Type cargo: " + station.getName());
        System.out.println("Volume cargo: " + station.getDescription());

        System.out.println();

    }

    public void viewAllStation() {
        ArrayList<Station> stations = stationController.getAllEntities();

        for (int i = 0; i < stations.size(); i++) {
            showStationInfo(stations.get(i));
        }

        System.out.println("==================STATIONS=====================");
        System.out.println("Select option:");
        System.out.println("1 - Create new Station");
        System.out.println("2 - Find a Station");
        System.out.println("3 - View all Stations");
        System.out.println("0 - Move to previous menu");
    }

}



