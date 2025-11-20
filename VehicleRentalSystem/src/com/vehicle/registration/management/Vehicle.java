package com.vehicle.registration.management;
import java.util.Date;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double ratePerDay;
    private boolean isAvailable;

    public Vehicle(String make, String model, int year, double ratePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }
    public double getRatePerDay() {
        return ratePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
   
    public void setAvailable(boolean status, String userId) {
        
        if (status != this.isAvailable) {
            this.isAvailable = status;
            System.out.println("Log: Vehicle status updated to " + (status ? "Available" : "Rented") + " by User " + userId + " on " + new Date());
        }
    }
    
    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (Rate: $" + ratePerDay + "/day)";
    }
}