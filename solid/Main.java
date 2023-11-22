package javaOOP.JavaOOP.solid;

import javaOOP.JavaOOP.solid.calculator.CalorieCalculator;

public class Main {

    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        Printer printer = new Printer(calorieCalculator);

       // printer.printAverage();
    }
}
