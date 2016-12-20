package com.cbsgenesis.trainsmanagementsystem.view;

import com.cbsgenesis.trainsmanagementsystem.controller.LocomotiveController;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Java on 20.12.2016.
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


        }
        while (locomotive.getName().isEmpty() || locomotive.getName() == null){
            System.out.println("Enter the name of the locomotive");
            locomotive.setName(scanner.nextLine());
        }

        while (locomotive.getCapacity() == 0){
            System.out.println("Enter the locomotive capacity");
            locomotive.setCapacity(scanner.nextInt());


        }


    }


}
