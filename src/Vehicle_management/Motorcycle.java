package Vehicle_management;

public class Motorcycle extends Vehicle {
    private int engineDisplacement;

    public Motorcycle(String plateNumber, String maker, String model, int engineDisplacement) {
        super(plateNumber, maker, model);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() { return engineDisplacement; }
    public void setEngineDisplacement(int engineDisplacement) { this.engineDisplacement = engineDisplacement; }
}
