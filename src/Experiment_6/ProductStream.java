package Experiment_6;

import java.util.*;
import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + price;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 50000),
                new Product(2, "Mobile", 20000),
                new Product(3, "Tablet", 15000),
                new Product(4, "Monitor", 12000)
        );

        System.out.println("Products with price > 15000:");
        products.stream()
                .filter(p -> p.price > 15000)
                .forEach(System.out::println);

        System.out.println("\nProduct Names:");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);

        double avgPrice = products.stream()
                .mapToDouble(p -> p.price)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage Price: " + avgPrice);
    }
}
