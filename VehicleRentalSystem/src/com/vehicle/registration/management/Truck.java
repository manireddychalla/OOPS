package com.vehicle.registration.management;

public class Truck extends Vehicle {
	
	private final static double HEAVY_DUTY_SURCHARGE= 20.00;
	
	private double payloadCapacity;
	
	public Truck(String make, String model, int year, double ratePerDay, double payloadCapacity) {
        super(make, model, year, ratePerDay);
        this.payloadCapacity = payloadCapacity; // Truck specific attribute
    }

	
	@Override
    public double calculateRentalCost(int days) {
        double baseCost = getRatePerDay() * days;
        double surcharge = HEAVY_DUTY_SURCHARGE * days;
        return baseCost + surcharge;
    }
    
    @Override
    public String toString() {
        return "Truck: " + super.toString() + ", Payload: " + payloadCapacity + " tons";
    }

}
