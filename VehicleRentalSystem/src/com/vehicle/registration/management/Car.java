package com.vehicle.registration.management;

public class Car extends Vehicle{
	
	private int doors;
	
	public Car(String make, String model, int year, double ratePerDay, boolean isAvaliabile,int doors) {
		super(make, model, year, ratePerDay);
		this.doors=doors;
		
	}
	
	@Override
    public double calculateRentalCost(int days) {

        double baseCost = getRatePerDay() * days;
        if (days >= 7) {
            double discount = baseCost * 0.10;
            return baseCost - discount;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() + ", Doors: " + doors;
    }
	

}
