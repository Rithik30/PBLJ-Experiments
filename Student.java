package Exp6;

import java.io.Serializable;

public class Student implements Serializable {
    // This is to ensure compatibility during serialization
    private static final long serialVersionUID = 1L;

    private String studentID;
    private String name;
    private double grade;

    // Constructor
    public Student(String studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // To display student details
    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", Grade: " + grade;
    }
}
