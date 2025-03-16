package com.example.cabbooking.model;  // ✅ Ensure correct package

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pickup;
    private String destination;
    private int typeOfCab;
    private double distance;
    private double fare;

    // Constructors
    public Booking() {}

    public Booking(String pickup, String destination, int typeOfCab, double distance, double fare) {
        this.pickup = pickup;
        this.destination = destination;
        this.typeOfCab = typeOfCab;
        this.distance = distance;
        this.fare = fare;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getPickup() { return pickup; }
    public String getDestination() { return destination; }
    public int getTypeOfCab() { return typeOfCab; }
    public double getDistance() { return distance; }
    public double getFare() { return fare; }

    public void setPickup(String pickup) { this.pickup = pickup; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setTypeOfCab(int typeOfCab) { this.typeOfCab = typeOfCab; }
    public void setDistance(double distance) { this.distance = distance; }
    public void setFare(double fare) { this.fare = fare; }
}

