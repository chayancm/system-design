package patterns.strategy.with;

import patterns.strategy.with.drive.SpecialDrive;

public class OffRoadCar extends Vehicle {
    public OffRoadCar() {
        super(new SpecialDrive());
    }
}