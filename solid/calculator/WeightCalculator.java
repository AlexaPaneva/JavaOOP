package javaOOP.JavaOOP.solid.calculator;

import javaOOP.JavaOOP.solid.products.Product;

import java.util.List;

public class WeightCalculator implements Calculator {
    public double total(List<Product> products) {
        return products.stream().mapToDouble(Product::getKilograms).sum();
    }

    @Override
    public double totalAverage(List<Product> products) {
        return total(products) / products.size();
    }


}
