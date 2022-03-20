package exception_in_java.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Students_file_objects {
    public static void main(String[] args) {
        try {
            student1211[] array = new student1211[4];
            student1211 s1 = new student1211("Vedant", "20BCE2126", "1212", "Scope");
            student1211 s2 = new student1211("Varun", "20BCE2124", "1213", "Scope");
            student1211 s3 = new student1211("Vivek", "20BCE2125", "1214", "Scope");
            student1211 s4 = new student1211("Vinayak", "20BCE2127", "1215", "Core");
            array[0] = s1;
            array[1] = s2;
            array[2] = s3;
            array[3] = s4;
            FileOutputStream fout = new FileOutputStream("Student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (student1211 k : array) {
                out.writeObject(k);
            }
            out.flush();
            out.close();
            System.out.println("File Writing success");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.txt"));
            for (student1211 m : array) {
                m = (student1211) in.readObject();
                if (m.Depart.equals("Scope")) {
                    System.out.println("Name : " + m.name + " Rollno. : " + m.Rollno + " StudentID : " + m.StudentID);
                }
            }

            in.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class student1211 implements Serializable {
    String name;
    String Rollno;
    String StudentID;
    String Depart;

    public student1211(String name, String Rollno, String StudentID, String Depart) {
        this.name = name;
        this.Rollno = Rollno;
        this.StudentID = StudentID;
        this.Depart = Depart;
    }
}
