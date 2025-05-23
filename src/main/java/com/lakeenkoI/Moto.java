package main.java.com.lakeenkoI;

public class Moto extends Vehicle {

    private Engine engine;

    public Moto(String model, int year, Engine engine) {
        super(model, year);
        this.engine = engine;
    }

    @Override
    public double calculateEfficiency() {
        return engine.getPower() / 10.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Двигатель: " + engine.getType() + ", Мощность: " + engine.getPower() + " л.с.");
    }
}
