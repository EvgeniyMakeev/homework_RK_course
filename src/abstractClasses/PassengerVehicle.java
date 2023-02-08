package abstractClasses;

public class PassengerVehicle extends GroundVehicle {

    private String bodyType;
    private int numberOfPassengers;

    public PassengerVehicle(double power, int maxSpeed, double weight, String brand, int wheels, double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Пассажирская машина: \n" +
                "Марка - " + getBrand() + '\n' +
                "Тип кузова - " + bodyType + '\n' +
                "Кол-во пассажиров - " + numberOfPassengers + '\n' +
                "Масса (кг) - " + getWeight() + '\n' +
                "Мощность (в лошадиных силах) - " + getPower() + '\n' +
                "Мощность (в киловаттах) - " + powerToKiloWatt(getPower()) + '\n' +
                "Максимальная скорость(км/ч) - " + getMaxSpeed() + '\n' +
                "Расход топлива (л/100км) - " + getFuelConsumption() + '\n';
    }

    public void getCalcCarConsumesFuel(double hour) {
        calcCarConsumedFuel(hour);
    }

    private void calcCarConsumedFuel(double hour) {
        double consumedFuel = ((hour * getMaxSpeed()) / 100) * getFuelConsumption();
        System.out.println("За время " + hour + " часа, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч израсходует " + consumedFuel + " литров топлива." + '\n');
    }
}