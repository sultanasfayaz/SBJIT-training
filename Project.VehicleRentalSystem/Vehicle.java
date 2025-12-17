package model;

public abstract class Vehicle {
    protected String vehicleId;
    protected String brand;
    protected double rentPerDay;
    protected boolean isAvailable = true;
    protected Customer rentedBy;   

    public Vehicle(String vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    
    public Customer getRentedBy() {
        return rentedBy;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String getVehicleId() {
        return vehicleId;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getRentPerDay() {
        return rentPerDay;
    }
    
    public void rentVehicle(Customer customer) {
        this.isAvailable = false;
        this.rentedBy = customer;
    }

    public void returnVehicle() {
        this.isAvailable = true;
        this.rentedBy = null;
    }

    public abstract double calculateRent(int days);

    @Override
    public String toString() {
        return vehicleId + " | " + brand + " | ₹" + rentPerDay +
               "/day | Available: " + isAvailable;
    }
}
