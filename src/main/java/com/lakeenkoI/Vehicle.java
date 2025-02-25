package main.java.com.lakeenkoI;

public abstract class Vehicle {

    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract double calculateEfficiency();

    public void displayInfo() {

        System.out.println("Модель: " + model + "\nГод выпуска: " + year);
        System.out.println("Эффективность: " + calculateEfficiency());
    }
}
