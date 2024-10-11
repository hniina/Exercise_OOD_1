package Vehicle_management;

public class Vehicle {
    private String plateNumber;
    private String maker;
    private String model;

    public Vehicle(String plateNumber, String maker, String model) {
        this.plateNumber = plateNumber;
        this.maker = maker;
        this.model = model;
    }

    // Getters and setters
    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public String getMaker() { return maker; }
    public void setMaker(String maker) { this.maker = maker; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
