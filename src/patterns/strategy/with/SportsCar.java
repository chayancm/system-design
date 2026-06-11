package patterns.strategy.with;

import patterns.strategy.with.drive.SpecialDrive;

public class SportsCar extends Vehicle {
    public  SportsCar() {
        super(new SpecialDrive());
    }
}
