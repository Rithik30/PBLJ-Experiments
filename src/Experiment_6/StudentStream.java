package Experiment_6;

import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Riya", 85),
                new Student(2, "Amit", 60),
                new Student(3, "Neha", 92),
                new Student(4, "Raj", 55)
        );

        System.out.println("Students with marks > 70, sorted by marks:");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> Double.compare(s1.marks, s2.marks))
                .forEach(System.out::println);
    }
}
