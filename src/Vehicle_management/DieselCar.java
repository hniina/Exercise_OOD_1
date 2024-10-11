package Vehicle_management;

public class DieselCar extends Vehicle {
    private int co2Emissions;

    public DieselCar(String plateNumber, String maker, String model, int co2Emissions) {
        super(plateNumber, maker, model);
        this.co2Emissions = co2Emissions;
    }

    // getters and setters
    public int getCo2Emissions() { return co2Emissions; }
    public void setCo2Emissions(int co2Emissions) { this.co2Emissions = co2Emissions; }
}
