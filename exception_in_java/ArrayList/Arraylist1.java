package exception_in_java.ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Student1122> array = new ArrayList<Student1122>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of students : ");
        int num = input.nextInt();
        Student1122[] array1 = new Student1122[num];
        for (int i = 0; i < num; i++) {
            array1[i] = new Student1122();
            array1[i].set_details();
            array.add(array1[i]);
        }
        Iterator<Student1122> itr = array.iterator();
        while (itr.hasNext()) {
            Student1122 s = itr.next();
            if (s.Regno.contains("20BCE")) {
                System.out.println(
                        "Name: " + s.Name + " Regno. : " + s.Regno + " Course: " + s.Course + " Department : " + s.Depart);
            }
        }
    }
}

class Student1122 {
    String Name;
    String Regno;
    String Depart;
    String Course;

    public void set_details() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Name: ");
            Name = input.next();
            System.out.println("Enter Regno. : ");
            Regno = input.next();
            System.out.println("Enter Department name : ");
            Depart = input.next();
            System.out.println("Enter course : ");
            Course = input.next();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
