package vehicle_rental_system;

import model.*;
import service.RentalService;

import java.util.Scanner;

public class VehicleRentalApp {

    public static void main(String[] args) {
        RentalService service = new RentalService();
        Scanner scanner = new Scanner(System.in);

        service.addVehicle(new Car("C101", "Honda", 2000));
        service.addVehicle(new Car("C102", "Hyundai", 1800));
        service.addVehicle(new Car("C103", "Toyota", 2200));
        
        service.addVehicle(new Bike("B201", "Yamaha", 800));
        service.addVehicle(new Bike("B202", "Honda", 700));
        service.addVehicle(new Bike("B203", "Bajaj", 600));

        while (true) {
            System.out.println("\n1. View Available Vehicles"+
                 "\n2. Add Customer"+
            	 "\n3. View Customer"+
                 "\n4 Rent Vehicle"+
            	 "\n5. Return Vehicle"+
                 "\n6. Rented Vehicle"+
                 "\n7. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    service.showAvailableVehicles();
                    break;
                    
                case 2:
                    System.out.print("Customer ID: ");
                    String cid = scanner.next();
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Phone: ");
                    String phone = scanner.next();

                    service.addCustomer(new Customer(cid, name, phone));
                    System.out.println("Customer Added!");
                    break;
                case 3:
                    System.out.println("---- Customer List ----");
                    service.showCustomers();
                    break;    
                case 4:
                	System.out.print("Customer ID: ");
                    String custId = scanner.next();
                    Customer customer = service.findCustomer(custId);

                    if (customer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }

                    System.out.print("Vehicle ID: ");
                    String vehicleID = scanner.next();
                    Vehicle vehicle = service.findVehicle(vehicleID);

                    if (vehicle != null && vehicle.isAvailable()) {
                        System.out.print("Enter days: ");
                        int days = scanner.nextInt();
                        System.out.println("Total Rent: ₹" + vehicle.calculateRent(days));
                        vehicle.rentVehicle(customer);
                        System.out.println("Vehicle Rented Successfully!");
                    } else {
                        System.out.println("Vehicle not available!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Vehicle ID: ");
                    String returnId = scanner.next();
                    Vehicle returnVehicle = service.findVehicle(returnId);

                    if (returnVehicle != null && !returnVehicle.isAvailable()) {
                        returnVehicle.returnVehicle();
                        System.out.println("Vehicle Returned Successfully!");
                    } else {
                        System.out.println("Invalid vehicle ID!");
                    }
                    break;
                case 6:
                    System.out.println("---- Rented Vehicles ----");
                    service.showRentedVehicles();
                    break;
                    
                case 7:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
