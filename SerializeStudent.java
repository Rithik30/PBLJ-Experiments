package Exp6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("S101", "Rithik Srivastava", 9.5);

        try {
            // Create a file output stream to write the object to a file
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Serialize the student object
            out.writeObject(student);

            out.close();
            fileOut.close();
            System.out.println("Student object has been serialized and saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

