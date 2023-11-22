package javaOOP.JavaOOP.solid.calculator;

import javaOOP.JavaOOP.solid.products.Product;

import java.util.List;

public interface Calculator {
    double total(List<Product> products);

    double totalAverage(List<Product> products);
}
