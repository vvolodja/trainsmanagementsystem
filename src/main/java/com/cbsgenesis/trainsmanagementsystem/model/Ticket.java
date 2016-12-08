package com.cbsgenesis.trainsmanagementsystem.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Simple class that represents ticker
 *
 * Created by Andrey Babenko on 12/1/16.
 */
public class Ticket extends BaseEntity {
    private String firstName;
    private String lastName;
    private String typeOfWagoon;
    private int place;
    private Date departureDate;
    private Date arriveDate;
    private boolean bed;
    private int tea;
    private int coffee;
    private int baggage;

    private DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm");

    public Ticket() {
    }

    public Ticket(String firstName,
                  String lastName,
                  String typeOfWagoon,
                  int place,
                  Date departureDate,
                  Date arriveDate,
                  boolean bed,
                  int tea,
                  int coffee,
                  int baggage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfWagoon = typeOfWagoon;
        this.place = place;
        this.departureDate = departureDate;
        this.arriveDate = arriveDate;
        this.bed = bed;
        this.tea = tea;
        this.coffee = coffee;
        this.baggage = baggage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTypeOfWagoon() {
        return typeOfWagoon;
    }

    public void setTypeOfWagoon(String typeOfWagoon) {
        this.typeOfWagoon = typeOfWagoon;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + super.getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", typeOfWagoon='" + typeOfWagoon + '\'' +
                ", place=" + place +
                ", departureDate=" + departureDate +
                ", arriveDate=" + arriveDate +
                ", bed=" + bed +
                ", tea=" + tea +
                ", coffee=" + coffee +
                ", baggage=" + baggage +
                '}';
    }
}
