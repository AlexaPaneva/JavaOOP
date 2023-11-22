package javaOOP.JavaOOP.solid;

import javaOOP.JavaOOP.solid.calculator.Calculator;
import javaOOP.JavaOOP.solid.products.Product;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";

    private static final String AVERAGE = "Average: %f";
    private Calculator calculator;
    public Printer(Calculator calorieCalculator) {
        this.calculator = calorieCalculator;
    }

    public void printSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.total(products));
    }

    public void printAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.totalAverage(products));
    }
}
