package com.vehicle.registration.management;

public class VehicleRentedInfo {
	    
	    public static void main(String[] args) {
	        
	        RentalService service = new RentalService();
	        Car car1 = new Car("Fortunure", "Camry", 2022, 50.00, false, 4); 
	        Truck truck1 = new Truck("AshokLeyLand", "2500", 2024, 90.00, 4.0); 
	        
	        service.addVehicle(car1);
	        service.addVehicle(truck1);
	        
	        System.out.println("--- Current Fleet ---");
	        System.out.println("0: " + car1);
	        System.out.println("1: " + truck1);

	        service.createBooking(0, "Alice", 10);
	        service.createBooking(1, "Bob", 3);
	        System.out.println("\n--- Testing Encapsulation (Availability Check) ---");
	        service.createBooking(0, "Charlie", 5);
	        
	        System.out.println("\n--- Final Bills (Polymorphism in Action) ---");
	        
	        
	        Vehicle[] rentedVehicles = {car1, truck1}; 
	        
	        for (Vehicle v : rentedVehicles) {
	            int daysRented = 5; 
	            double finalCost = v.calculateRentalCost(daysRented); 
	            System.out.printf("%s 5-Day Cost: $%.2f%n", v.toString().split(" ")[1], finalCost);
	        }
	    }
	}
