package patterns.strategy.with;

import patterns.strategy.with.drive.NormalDrive;

public class PassengerCar extends  Vehicle {
    public PassengerCar() {
        super(new NormalDrive());
    }
}
