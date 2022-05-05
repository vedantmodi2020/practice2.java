package exception_in_java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList_reverse {
    public static void main(String[] args) {

        try {
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
            ListIterator<Student1122> itr = array.listIterator();
            while (itr.hasPrevious()) {
                Student1122 s = itr.previous();
                if (s.Regno.contains("20BCE")) {
                    System.out.println("Name: " + s.Name + " Regno. : " + s.Regno + " Course: " + s.Course + " Department : "+ s.Depart);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
