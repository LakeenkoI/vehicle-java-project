package main.java.com.lakeenkoI;

import java.util.ArrayList;

public class Service {

    public void runApplication() {
        ArrayList<Vehicle> vehicleArrayList = createVehicleCollection();

        for (Vehicle vehicle : vehicleArrayList) {
            vehicle.displayInfo();


            if (vehicle instanceof Driveable) {
                callDrive((Driveable) vehicle);
            }

            if (vehicle instanceof Electric) {
                callChargeBattery((Electric) vehicle, 80);
            }
            System.out.println();
        }
    }

    public void callDrive(Driveable driveable) {
        driveable.drive();
    }

    public void callChargeBattery(Electric electric, int capacity) {
        electric.chargeBattery(capacity);
    }

    public ArrayList<Vehicle> createVehicleCollection() {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        vehicleArrayList.add(new Car("Sandero", 2010, new Engine(PowerConstant.POWER_150, TypeOfEngine.GAS)));
        vehicleArrayList.add(new Car("BMW", 2024, new Engine(PowerConstant.POWER_300, TypeOfEngine.ELECTRIC)));
        vehicleArrayList.add(new Bicycle("Аист", 2002));
        vehicleArrayList.add(new ElectricScooter("Xiaomi", 2012));
        vehicleArrayList.add(new Moto("Honda", 2010, new Engine(PowerConstant.POWER_150, TypeOfEngine.GAS)));

        return vehicleArrayList;
    }

}
