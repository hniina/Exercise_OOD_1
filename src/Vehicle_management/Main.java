package Vehicle_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // a person and vehicles
        Person person = new Person("12345678", "Niina", "Hietamaki", "123 Barcelona");
        Vehicle motorcycle = new Motorcycle("XYZ123", "Yamaha", "BikexD", 847);
        Vehicle petrolCar = new PetrolCar("ABC123", "Toyota", "Corolla", 120);
        Vehicle dieselCar = new DieselCar("DEF456", "BMW", "5", 180);
        Vehicle hybridCar = new HybridCar("GHI789", "Tesla", "Model Y", 50);

        person.addVehicle(motorcycle);
        person.addVehicle(petrolCar);
        person.addVehicle(dieselCar);
        person.addVehicle(hybridCar);

        //tax reports
        person.generateTaxReport();

        Person newOwner = new Person("87654321", "Marta", "Bennet", "456 Barcelona");
        person.transferVehicle(newOwner, motorcycle);

        person.updatePerson("Anna", "Smith", "789 Helsinki");
        person.deleteVehicle(motorcycle);

        //tax reports
        person.generateTaxReport();
        newOwner.generateTaxReport();

        // Search for a person by license number
        List<Person> allPersons = new ArrayList<>();
        allPersons.add(person);
        allPersons.add(newOwner);
        Person foundPerson = findPersonByLicense(allPersons, "12345678");
        if (foundPerson != null) {
            System.out.println("Person found: " + foundPerson.name + " " + foundPerson.surname);
        }
    }

    // Search for a person by license number
    public static Person findPersonByLicense(List<Person> persons, String licenseNumber) {
        for (Person person : persons) {
            if (person.licenseNumber.equals(licenseNumber)) {
                return person;
            }
        }
        System.out.println("Person not found.");
        return null;
    }


}
