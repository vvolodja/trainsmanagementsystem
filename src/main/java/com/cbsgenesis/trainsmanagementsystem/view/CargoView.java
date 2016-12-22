package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.CargoController;
import com.cbsgenesis.trainsmanagementsystem.controller.StationController;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Java on 22.12.2016.
 */
public class CargoView {
    CargoController cargoController = new CargoController();

    public void showCargoMenu() throws ParseException {

        System.out.println("==================CARGO=====================");
        System.out.println("Select option:");
        System.out.println("1 - Create new cargo");
        System.out.println("2 - Find a cargo");
        System.out.println("3 - View all cargos");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;
        System.out.println("========== TICKETS ==========\n");

        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        createCargoMenu();
                    } catch (ParseException e) {
                        e.getStackTrace();
                    }
                    break;
                case 2:
                    //findCargoMenu();
                    break;
                case 3:
                   // viewAllCargos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("This is no such option. Please chose from the list.");
            }
        }

    }

    private void createCargoMenu() throws ParseException {
        Cargo cargo = new Cargo();

        cargo.setType("");
        cargo.setVolume(-1);
        cargo.setWeight(-1);
        cargo.setDimension(-1);
        cargo.setQuantityOfCars(-1);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============CREATE CARGO===============");

        while (cargo.getId() == null) {
            System.out.println("Enter cargo Id ");
            Long tempId = scanner.nextLong();
            if (cargoController.getEntityById(tempId) != null) {
                System.out.println("Ticket with such ID is already existed. Please enter another ID.");
            } else {
                cargo.setId(tempId);
            }
        }
        scanner = new Scanner(System.in);

        while (cargo.getType() == null) {
            System.out.println("Enter type of cargo:");
            cargo.setType(scanner.nextLine());
        }
        scanner = new Scanner(System.in);

        while (cargo.getVolume() == null) {
            System.out.println("Enter volume of cargo: ");
            cargo.setVolume(scanner.nextInt());
        }

        scanner = new Scanner(System.in);

        while (cargo.getDimension() ==null) {
            System.out.println("Enter dimension of cargo: ");
            cargo.setDimension(scanner.nextInt());
        }
        scanner = new Scanner(System.in);

        while (cargo.getQuantityOfCars() ==null) {
            System.out.println("Enter quantity of cars : ");
            cargo.setQuantityOfCars(scanner.nextInt());
        }

        cargoController.saveEntity(cargo);
        System.out.println("New cargo have been successfully added");
        System.out.println();

        System.out.println("==================CARGO=====================");
        System.out.println("Select option:");
        System.out.println("1 - Create new cargo");
        System.out.println("2 - Find a cargo");
        System.out.println("3 - View all cargos");
        System.out.println("0 - Move to previous menu");
    }

    public void findCargoMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== FIND A TICKET ==========\n");
        System.out.println("Enter ticket ID to start search or enter 0 to move to previous menu:");
        Long tempId = scanner.nextLong();
        Cargo cargo = cargoController.getEntityById(tempId);
        if (cargo.getId() == null) {
                   System.out.println("There is no ticket with such ID");
                   } else {
                       showCargoInfo(cargo);
                   }

    }
}
