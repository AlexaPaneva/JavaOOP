package javaOOP.JavaOOP.polymorphismE.vehicles;

public class Car extends Vehicle {
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
        //second way
        // setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
    }
}
