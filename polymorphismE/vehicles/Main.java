package javaOOP.JavaOOP.polymorphismE.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carData = scanner.nextLine().split("\\s+");

        double carFuelAmount = Double.parseDouble(carData[1]);
        double carFuelConsumption = Double.parseDouble(carData[2]);

        Vehicle car = new Car(carFuelAmount, carFuelConsumption);

        String[] truckData = scanner.nextLine().split("\\s+");
        double truckFuelAmount = Double.parseDouble(truckData[1]);
        double truckFuelConsumption = Double.parseDouble(truckData[2]);

        Vehicle truck = new Truck(truckFuelAmount, truckFuelConsumption);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName) {
                case "Drive":
                    vehicleMap.get(vehicleType).drive(argument);
                    break;

                case "Refuel":
                    vehicleMap.get(vehicleType).refuel(argument);
                    break;
            }
        }
//        System.out.println(car);
//        System.out.println(truck);
        vehicleMap.values().forEach(System.out::println);
    }
}
