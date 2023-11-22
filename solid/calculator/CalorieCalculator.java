package javaOOP.JavaOOP.solid.calculator;

import javaOOP.JavaOOP.solid.products.Product;

import java.util.List;

public class CalorieCalculator implements Calculator {

    public double total(List<Product> products) {
        double sum = 0;
        return products.stream().mapToDouble(Product::getCalories).sum();
    }

    public double average(List<Product> products) {
        return total(products) / products.size();
    }
}
