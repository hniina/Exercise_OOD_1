package Vehicle_management;

public class PetrolCar extends Vehicle {
    private int co2Emissions; // CO2 emissions in grams

    public PetrolCar(String plateNumber, String maker, String model, int co2Emissions) {
        super(plateNumber, maker, model);
        this.co2Emissions = co2Emissions;
    }

    // Getters and setters
    public int getCo2Emissions() { return co2Emissions; }
    public void setCo2Emissions(int co2Emissions) { this.co2Emissions = co2Emissions; }
}
