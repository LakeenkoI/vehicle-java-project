package main.java.com.lakeenkoI;

public class Bicycle extends Vehicle implements Driveable {

    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    public double calculateEfficiency() {
        return 15.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Велосипед");
    }

    @Override
    public void drive() {
        System.out.println("Велосипед " + model + " едет");
    }
}

