package abstractClasses;

public class GroundVehicle extends Vehicle {
    private int wheels;
    private double fuelConsumption;

    public GroundVehicle(double power, int maxSpeed, double weight, String brand, int wheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
