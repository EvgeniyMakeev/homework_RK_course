package abstractClasses;

public class MilitaryAircraft extends AviaVehicle {

        private boolean presenceOfABailoutSystem;
        private int numberOfMissilesOnBoard;

    public MilitaryAircraft(double power, int maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLengthForTakeoff, boolean presenceOfABailoutSystem, int numberOfMissilesOnBoard) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        this.presenceOfABailoutSystem = presenceOfABailoutSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    public boolean isPresenceOfABailoutSystem() {
        return presenceOfABailoutSystem;
    }

    public void setPresenceOfABailoutSystem(boolean presenceOfABailoutSystem) {
        this.presenceOfABailoutSystem = presenceOfABailoutSystem;
    }

    public int getNumberOfMissilesOnBoard() {
        return numberOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    @Override
    public String toString() {
        return "Военный самолёт: \n" +
                "Марка - " + getBrand() + '\n' +
                "Масса (кг) - " + getWeight() + '\n' +
                "Мощность (в лошадиных силах) - " + getPower() + '\n' +
                "Максимальная скорость(км/ч) - " + getMaxSpeed() + '\n' +
                "Размах крыльев (м) - " + getWingspan() + '\n' +
                "Минимальная длина взлётно-посадочной полосы для взлёта  - " + getMinimumRunwayLengthForTakeoff() + '\n' +
                "Кол-во ракет на борту - " + numberOfMissilesOnBoard + '\n' +
                "Наличие системы катапультирования - " + isPresenceOfABailoutSystem() + '\n';
    }

    public void getFireMissiles(double numberOfMissilesOnBoard) {
        System.out.println(this.numberOfMissilesOnBoard >= numberOfMissilesOnBoard ? "Ракета пошла...\n" : "Боеприпасы отсутствуют.\n");
    }
    public void catapult() {
        System.out.println(presenceOfABailoutSystem == true ? "Катапультирование прошло успешно.\n" : "У вас нет такой системы.\n");
    }
}