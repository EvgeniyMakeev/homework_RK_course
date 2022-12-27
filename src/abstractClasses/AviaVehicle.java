package abstractClasses;

public class AviaVehicle extends Vehicle {

    private double wingspan;
    private double minimumRunwayLengthForTakeoff;

    public AviaVehicle(double power, int maxSpeed, double weight, String brand, double wingspan, double minimumRunwayLengthForTakeoff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeoff = minimumRunwayLengthForTakeoff;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getMinimumRunwayLengthForTakeoff() {
        return minimumRunwayLengthForTakeoff;
    }

    public void setMinimumRunwayLengthForTakeoff(double minimumRunwayLengthForTakeoff) {
        this.minimumRunwayLengthForTakeoff = minimumRunwayLengthForTakeoff;
    }
}
