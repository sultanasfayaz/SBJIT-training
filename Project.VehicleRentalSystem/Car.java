package model;

public class Car extends Vehicle {

    public Car(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return days * rentPerDay;
    }
}
