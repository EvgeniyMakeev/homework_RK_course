package abstractClasses;

public class CargoVehicle extends GroundVehicle {

    private double loadCapacity;

    public CargoVehicle(double power, int maxSpeed, double weight, String brand, int wheels, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    @Override
    public String toString() {
        return "Грузовая машина: \n" +
                "Марка - " + getBrand() + '\n' +
                "Масса (кг) - " + getWeight() + '\n' +
                "Мощность (в лошадиных силах) - " + getPower() + '\n' +
                "Мощность (в киловаттах) - " + powerToKiloWatt(getPower()) + '\n' +
                "Максимальная скорость(км/ч) - " + getMaxSpeed() + '\n' +
                "Расход топлива (л/100км) - " + getFuelConsumption() + '\n' +
                "Грузоподъёмность(т) - " + loadCapacity + '\n';
    }

    public void calcLoadCapacity(double kilo) {
        if (kilo <= loadCapacity) {
            System.out.println("Грузовик загружен.\n");
        } else {
            System.out.println("Вам нужен грузовик побольше.\n");
        }
    }
}
