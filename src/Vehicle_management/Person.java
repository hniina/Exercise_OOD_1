package Vehicle_management;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String licenseNumber;
    public String name;
    public String surname;
    public String address;
    public List<Vehicle> vehicles;

    public Person(String licenseNumber, String name, String surname, String address) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void transferVehicle(Person newOwner, Vehicle vehicle) {
        if (vehicles.remove(vehicle)) {
            newOwner.addVehicle(vehicle);
            System.out.println("Vehicle successfully transferred to: " + newOwner.name);
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    //  a tax report for the person
    public void generateTaxReport() {
        double totalTax = 0;
        System.out.println("Tax report for: " + name + " " + surname);
        for (Vehicle vehicle : vehicles) {
            double tax = TaxCalculator.calculateTax(vehicle);
            totalTax += tax;
            System.out.println(vehicle.getMaker() + " " + vehicle.getModel() + ": " + tax + "€");
        }
        System.out.println("Total tax: " + totalTax + "€\n");
    }

    public void updatePerson(String newName, String newSurname, String newAddress) {
        this.name = newName;
        this.surname = newSurname;
        this.address = newAddress;
        System.out.println("Person details updated : " + name + " " + surname + ", Address: " + address);
    }
    public void deleteVehicle(Vehicle vehicle) {
        if (vehicles.remove(vehicle)) {
            System.out.println("Vehicle removed: " + vehicle.getMaker() + " " + vehicle.getModel());
        } else {
            System.out.println("Vehicle not found.");
        }
    }


}
