package patterns.strategy.with.drive;

public class SpecialDrive implements  DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
