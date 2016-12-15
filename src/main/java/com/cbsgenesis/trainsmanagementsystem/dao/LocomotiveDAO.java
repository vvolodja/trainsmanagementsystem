package com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/**
 * Create Locomotive DAO
 * @Author Evgenij Lukashik
 */
public class LocomotiveDAO implements GenericDAO<Locomotive> {
    String filePath = "src/resources/database_test/locomotive.txt";
    @Override
    public Locomotive getEntityById(Long id) {

        Locomotive locomotive = new Locomotive();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Long firstLong = Long.parseLong(splitedLine[0]);

                    if (firstLong == id) {
                        locomotive.setId(firstLong);
                        locomotive.setName(splitedLine[1]);
                        locomotive.setCapacity(Integer.parseInt(splitedLine[2]));
                        locomotive.setPower(Integer.parseInt(splitedLine[3]));
                        locomotive.setYearOfIssue(Integer.parseInt(splitedLine[4]));
                        locomotive.setFuelType(splitedLine[5]);
                        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);
                        locomotive.setLastServiceDate(dateFormat.parse(splitedLine[6]));

                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return locomotive;
    }

    @Override
    public void saveEntity(Locomotive locomotive) {
        String locomotiveToString = locomotive.getId()+ ","
                + locomotive.getName()+ "," + locomotive.getCapacity() + ","
                + locomotive.getPower()+ ","+ locomotive.getYearOfIssue()+ ","
                + locomotive.getFuelType()+ ","+locomotive.getLastServiceDate()+"/";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(locomotiveToString);
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    @Override
    public void updateEntity(Locomotive locomotive) {

        updateEntity(locomotive);
        removeEntity(locomotive);

    }

    @Override
    public void removeEntity(Locomotive locomotive) {

            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String read = null;
                while ((read = reader.readLine()) != null) {
                    String[] splitedFile = read.split("/");
                    for (String line : splitedFile) {
                        String[] splitedLine = line.split(",");

                        Long firstLong = Long.parseLong(splitedLine[0]);

                        if (firstLong == locomotive.getId()) {
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
    public List<Locomotive> getAllEntitys(){
        List<Locomotive>locomotives = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String read = null;
            while ((read = reader.readLine()) != null) {
                String[] splitedFile = read.split("/");
                for (String line : splitedFile) {
                    String[] splitedLine = line.split(",");

                    Locomotive locomotive = new Locomotive();
                    {
                        locomotive.setId(Long.parseLong(splitedLine[0]));
                        locomotive.setName(splitedLine[1]);
                        locomotive.setCapacity(Integer.parseInt(splitedLine[2]));
                        locomotive.setPower(Integer.parseInt(splitedLine[3]));
                        locomotive.setYearOfIssue(Integer.parseInt(splitedLine[4]));
                        locomotive.setFuelType(splitedLine[5]);
                        DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm", Locale.ENGLISH);
                        locomotive.setLastServiceDate(dateFormat.parse(splitedLine[6]));

                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return locomotives;
    }
}
