package abstractClasses;

public abstract class Vehicle {

    private double power;
    private int maxSpeed;
    private double weight;
    private String brand;

    public Vehicle(double power, int maxSpeed, double weight, String brand) {

        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double powerToKiloWatt(double power) {
        final double KW = 0.74;
        return power * KW;
    }

}