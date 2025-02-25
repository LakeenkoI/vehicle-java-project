package main.java.com.lakeenkoI;

public class Engine {

    private double power;
    private TypeOfEngine typeOfEngine;

    public Engine(double power, TypeOfEngine typeOfEngine) {
        this.power = power;
        this.typeOfEngine = typeOfEngine;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getType() {
        return typeOfEngine.getTypeName();
    }
}