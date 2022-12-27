package abstractClasses;

public class CivilAircraft extends AviaVehicle {

    private int numberOfPassengers;
    private boolean AvailabilityOfBusinessClass;

    public CivilAircraft(double power, int maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLengthForTakeoff, int numberOfPassengers, boolean availabilityOfBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        this.numberOfPassengers = numberOfPassengers;
        AvailabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isAvailabilityOfBusinessClass() {
        return AvailabilityOfBusinessClass;
    }

    public void setAvailabilityOfBusinessClass(boolean availabilityOfBusinessClass) {
        AvailabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    @Override
    public String toString() {
        return "Гражданский самолёт: \n" +
                "Марка - " + getBrand() + '\n' +
                "Масса (кг) - " + getWeight() + '\n' +
                "Мощность (в лошадиных силах) - " + getPower() + '\n' +
                "Максимальная скорость(км/ч) - " + getMaxSpeed() + '\n' +
                "Размах крыльев (м) - " + getWingspan() + '\n' +
                "Минимальная длина взлётно-посадочной полосы для взлёта (м) - " + getMinimumRunwayLengthForTakeoff() + '\n' +
                "Кол-во пассажиров - " + numberOfPassengers + '\n' +
                "Наличие бизнес класса - " + isAvailabilityOfBusinessClass() + '\n';
    }

    public void calcLoadCapacity(double passengers) {
        System.out.println(passengers <= numberOfPassengers ? "Самолёт загружен.\n" : "Вам нужен самолёт побольше.\n");
    }
}
