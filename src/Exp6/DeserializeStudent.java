package Exp6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        Student student = null;

        try {
            // Create a file input stream to read the object from the file
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object
            student = (Student) in.readObject();

            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the student details
        if (student != null) {
            System.out.println("Student object deserialized successfully:");
            System.out.println(student);
        }
    }
}

