package patterns.strategy.with.drive;


import patterns.strategy.with.OffRoadCar;
import patterns.strategy.with.PassengerCar;
import patterns.strategy.with.SportsCar;
import patterns.strategy.with.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new OffRoadCar();
        vehicle.drive();
        vehicle = new PassengerCar();
        vehicle.drive();
        vehicle = new SportsCar();
        vehicle.drive();

    }
}
