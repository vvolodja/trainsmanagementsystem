package com.cbsgenesis.trainsmanagementsystem.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Simple class that represents ticker
 *
 * @author Andrey Babenko
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
                  Integer place,
                  Date departureDate,
                  Date arriveDate,
                  boolean bed,
                  Integer tea,
                  Integer coffee,
                  Integer baggage) {
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

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
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

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getBaggage() {
        return baggage;
    }

    public void setBaggage(Integer baggage) {
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
