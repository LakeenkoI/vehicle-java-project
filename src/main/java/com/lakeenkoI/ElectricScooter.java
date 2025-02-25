package main.java.com.lakeenkoI;

public class ElectricScooter extends Vehicle implements Electric, Driveable {

    public ElectricScooter(String model, int year) {
        super(model, year);
    }

    @Override
    public double calculateEfficiency() {
        return 25.0;
    }

    @Override
    public void chargeBattery(int capacity) {
        System.out.println("Заряжено на " + capacity + "%");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void drive() {
        System.out.println("Электросамокат " + model + " едет");
    }
}
