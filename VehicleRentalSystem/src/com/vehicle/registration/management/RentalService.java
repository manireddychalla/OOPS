package com.vehicle.registration.management;

import java.util.ArrayList;
import java.util.List;

public class RentalService {

 private List<Vehicle> fleet; 
 
 public RentalService() {
     this.fleet = new ArrayList<>();
 }
 
 public void addVehicle(Vehicle vehicle) {
     this.fleet.add(vehicle);
 }
 
 
 private Vehicle getVehicleById(int vehicleId) {
     if (vehicleId >= 0 && vehicleId < fleet.size()) {
         return fleet.get(vehicleId);
     }
     return null;
 }
 
 
 public boolean createBooking(int vehicleId, String customerName, int days) {
     System.out.println("\n--- Attempting to book vehicle " + vehicleId + " for " + days + " days for " + customerName + " ---");
    
     Vehicle vehicle = getVehicleById(vehicleId);
     
     if (vehicle == null) {
         System.out.println("Vehicle not found.");
         return false;
     }

     if (!checkAvailability(vehicle)) {
         System.out.println(" Vehicle is currently unavailable.");
         return false;
     }
     
     double totalCost = vehicle.calculateRentalCost(days); 
     processPayment(customerName, totalCost);
     
     vehicle.setAvailable(false, "SystemAdmin"); 
     
     System.out.printf("Success! Vehicle Rented. Total Cost: $ ", totalCost);
     return true;
 }

 

 private boolean checkAvailability(Vehicle vehicle) {
     return vehicle.isAvailable(); 
 }

 private void processPayment(String customer, double amount) {
     System.out.printf(" Processing $%.2f payment for %s...%n", amount, customer);
     System.out.println(" Payment Gateway Confirmed.");
 }
}
