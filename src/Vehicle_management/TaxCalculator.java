package Vehicle_management;

public class TaxCalculator {
    public static double calculateTax(Vehicle vehicle) {
        if (vehicle instanceof Motorcycle) {
            return ((Motorcycle) vehicle).getEngineDisplacement() * 0.10;
        } else if (vehicle instanceof PetrolCar) {
            return ((PetrolCar) vehicle).getCo2Emissions() * 14;
        } else if (vehicle instanceof DieselCar) {
            return ((DieselCar) vehicle).getCo2Emissions() * 18;
        } else if (vehicle instanceof HybridCar) {
            return ((HybridCar) vehicle).getCo2Emissions() * 12;
        }
        return 0;
    }
}
