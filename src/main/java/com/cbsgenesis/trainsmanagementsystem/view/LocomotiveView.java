package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.LocomotiveController;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * * Create Locomotive View
 *
 * @Author Evgenij Lukashik
 */
public class LocomotiveView {
    LocomotiveController locomotiveController = new LocomotiveController();


    public void showLocomotiveMenu() {
        System.out.println("========LOCOMOTIVE==========");
        System.out.println("Select option");
        System.out.println("1 - Create Locomotive");
        System.out.println("2 - Find Locomotive");
        System.out.println("3 - View all Locomotives");
        System.out.println("0 - Move to previous menu");

        Scanner scanner = new Scanner(System.in);

        Integer choice = -1;
        while (choice != 0)
            scanner.nextInt();

        switch (choice) {

            case 1:
                try {
                    createLocomotiveMenu();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                findLocomotiveMenu();
                break;
            case 3:
                viewAllLocomotives();
                break;
            case 0:
                break;
            default:
                System.out.println("This is no such option. Please chose from the list.");

        }

    }

    public void createLocomotiveMenu() throws ParseException {

        Locomotive locomotive = new Locomotive();

        locomotive.setCapacity(-1);
        locomotive.setPower(-1);
        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        System.out.println("CREATE LOCOMOTIVE");

        while (locomotive.getId() == null) {
            System.out.println("Enter locomotive ID: ");

            Long tempID = scanner.nextLong();

            Locomotive locomotive1;

            locomotive1 = locomotiveController.getEntityById(tempID);

            System.out.println(locomotive1);

            if (locomotive1 != null) {
                System.out.println("locomotive with ID already exists. Please enter a different ID");
            } else {
                locomotive.setId(tempID);
            }

            scanner = new Scanner(System.in);


        }
        while (locomotive.getName().isEmpty() || locomotive.getName() == null) {
            System.out.println("Enter the name of the locomotive");
            locomotive.setName(scanner.nextLine());
        }

        while (locomotive.getCapacity() == 0) {
            System.out.println("Enter the locomotive capacity");
            locomotive.setCapacity(scanner.nextInt());
            if (locomotive.getCapacity() instanceof Integer || locomotive.getCapacity() > -1) {
                continue;
            } else {
                locomotive.setCapacity(-1);
                System.out.println("Wrong value. Capacity must be greater or equal to zero.");
            }
        }
        while (locomotive.getPower() == 0) {
            System.out.println("Enter the locomotive power");
            locomotive.setPower(scanner.nextInt());
            if (locomotive.getPower() instanceof Integer || locomotive.getCapacity() > -1){
                continue;

            }else {
                locomotive.setPower(-1);
                System.out.println("Wrong value. Power of locomotive must be greater or equal to zero.");
            }
        }
        while (locomotive.getYearOfIssue() == 0) {
            System.out.println("Enter the year when the locomotive was released (1955-2016)");
            locomotive.setYearOfIssue(scanner.nextInt());
            if (locomotive.getYearOfIssue() instanceof Integer || locomotive.getYearOfIssue() > 1955
                    || locomotive.getYearOfIssue() < 2016) {
                continue;
            } else {
                locomotive.setYearOfIssue(0);
                System.out.println("This year the train removed from operating or do not exist. Enter again.");
            }
        }
        while (locomotive.getFuelType().isEmpty() || locomotive.getFuelType() == null) {
            System.out.println("Enter the type of fuel(DIESEL, GAZ, ELECTRICITY)");
            String tipeOfFuel = scanner.nextLine();
            if (tipeOfFuel.equalsIgnoreCase("DIESEL")) {
                locomotive.setFuelType(tipeOfFuel);
            } else if (tipeOfFuel.equalsIgnoreCase("GAZ")) {
                locomotive.setFuelType(tipeOfFuel);
            } else if (tipeOfFuel.equalsIgnoreCase("ELECTRICITY")) {
                locomotive.setFuelType(tipeOfFuel);
            } else
                System.out.println("Do not put right type of fuel, please enter one of the three fuels (DIESEL, GAZ, ELECTRICITY)");
        }

        while (locomotive.getLastServiceDate() == null) {
            System.out.println("Enter the date of the last service");
            locomotive.setLastServiceDate(dateFormat.parse(scanner.nextLine()));
        }

        locomotiveController.saveEntity(locomotive);
        System.out.println("The new locomotive was successfully created");

        System.out.println("========LOCOMOTIVE==========");
        System.out.println("Select option");
        System.out.println("1 - Create Locomotive");
        System.out.println("2 - Find Locomotive");
        System.out.println("3 - View all Locomotives");
        System.out.println("0 - Move to previous menu");


    }

    public void findLocomotiveMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FIND LOCOMOTIVE");
        System.out.println("Enter the ID of the locomotive to start the search or 0 to move to the previous menu");

        Long temporaryID = scanner.nextLong();

        Locomotive locomotive = locomotiveController.getEntityById(temporaryID);

        if (locomotive.getId() == 0) {
            System.out.println("There is no locomotive with such ID");


        } else {
            showLocomotiveInfo(locomotive);
        }

        System.out.println("========LOCOMOTIVE==========");
        System.out.println("Select option");
        System.out.println("1 - Create Locomotive");
        System.out.println("2 - Find Locomotive");
        System.out.println("3 - View all Locomotives");
        System.out.println("0 - Move to previous menu");


    }

    public void showLocomotiveInfo(Locomotive locomotive) {
        System.out.println("========LOCOMOTIVE==========" + locomotive.getId());
        System.out.println("Locomotive name" + locomotive.getName());
        System.out.println("Capacity" + locomotive.getCapacity());
        System.out.println("FuelType" + locomotive.getFuelType());
        System.out.println("Power" + locomotive.getPower());
        System.out.println("Year of issue" + locomotive.getYearOfIssue());
        System.out.println("Last service date" + locomotive.getLastServiceDate());


    }

    public void viewAllLocomotives() {
        List<Locomotive> locomotives = locomotiveController.showAllLocomotives();

        for (int i = 0; i < locomotives.size(); i++) {
            showLocomotiveInfo(locomotives.get(i));
        }

        System.out.println("========LOCOMOTIVE==========");
        System.out.println("Select option");
        System.out.println("1 - Create Locomotive");
        System.out.println("2 - Find Locomotive");
        System.out.println("3 - View all Locomotives");
        System.out.println("0 - Move to previous menu");

    }
}

