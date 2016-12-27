package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.LocomotiveController;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * * Create Locomotive View
 * @Author Evgenij Lukashik
 */
public class LocomotiveView {
    LocomotiveController locomotiveController = new LocomotiveController();

    public void showLocomotiveMenu() {
        System.out.println("LOCOMOTIVE");
        System.out.println("Select option");
        System.out.println("1 - Create Locomotive");

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

        }

    }

    public void createLocomotiveMenu() throws ParseException {

        Locomotive locomotive = new Locomotive();

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
        }
        while (locomotive.getPower() == 0) {
            System.out.println("Enter the locomotive power");
            locomotive.setPower(scanner.nextInt());
        }
        while (locomotive.getYearOfIssue() == 0) {
            System.out.println("Enter the year when the locomotive was released (1955-2016)");
            locomotive.setYearOfIssue(scanner.nextInt());
            if (locomotive.getYearOfIssue() instanceof Integer || locomotive.getYearOfIssue() > 1955) {
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
            }else
                System.out.println("Do not put right type of fuel, please enter one of the three fuels (DIESEL, GAZ, ELECTRICITY)");
        }

        while (locomotive.getLastServiceDate()==null){
            System.out.println("Enter the date of the last service");
            locomotive.setLastServiceDate(dateFormat.parse(scanner.nextLine()));
        }
    }




}
