package abstractClasses;

import java.util.Scanner;

public class VehicleRuner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PassengerVehicle carPassenger = new PassengerVehicle(76.5, 180, 315.2, "Лада",
                4,4.1, "Универсал", 5);
        System.out.println(carPassenger);
        System.out.println("Сколько часов вы хотите проехать?");
        int hour = scan.nextInt();
        carPassenger.getCalcCarConsumesFuel(hour);

        CargoVehicle cargoVehicle = new CargoVehicle(630,180,460, "Камаз", 6,
                23, 500);
        System.out.println(cargoVehicle);
        System.out.println("Сколько килограммов вы хотите погрузить в машину?");
        int kilo = scan.nextInt();
        cargoVehicle.calcLoadCapacity(kilo);

        CivilAircraft passengerAircraft = new CivilAircraft(832,1120,342, "Boing", 47,
                312, 310, true);
        System.out.println(passengerAircraft);
        System.out.println("Сколько пассажиров хотят лететь?");
        int numberOfPassengers = scan.nextInt();
        passengerAircraft.calcLoadCapacity(numberOfPassengers);

       MilitaryAircraft warAircraft = new MilitaryAircraft (742,1853,212, "Су", 24,
                210, false, 0);
        System.out.println(warAircraft);
        warAircraft.getFireMissiles(3);
        warAircraft.catapult();
    }
}
