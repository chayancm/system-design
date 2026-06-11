package patterns.strategy.without;

public class Main {

    public static void main(String[] args) {

        //Here we wrote duplicate code in sports and off-road car and this will ony increase as
        // project grows bigger

        Vehicle vehicle = new OffRoadCar();
        vehicle.drive();
        vehicle = new PassengerCar();
        vehicle.drive();
        vehicle = new SportsCar();
        vehicle.drive();
    }
}
