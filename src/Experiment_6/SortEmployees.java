package Experiment_6;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Ravi", 55000),
                new Employee(102, "Anita", 75000),
                new Employee(103, "Karan", 45000)
        );

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("\nAfter Sorting by Salary:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("\nAfter Sorting by Name:");
        employees.forEach(System.out::println);
    }
}
