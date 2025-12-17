package service;

import model.*;
import java.util.*;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Vehicle findVehicle(String vehicleID) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equalsIgnoreCase(vehicleID)) {
                return vehicle;
            }
        }
        return null;
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void showAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }
    
    public void showRentedVehicles() {
        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isAvailable()) {
                found = true;
                System.out.println(
                    vehicle.getVehicleId() + " | " +
                    vehicle.getBrand() + " | ₹" +
                    vehicle.getRentPerDay() + "/day | Rented By: " +
                    vehicle.getRentedBy().getName()
                );
            }
        }

        if (!found) {
            System.out.println("No vehicles are currently rented.");
        }
    }


    public void showCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
