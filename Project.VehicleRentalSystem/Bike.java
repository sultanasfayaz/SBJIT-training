package model;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return days * rentPerDay * 0.9; // 10% discount
    }
}
