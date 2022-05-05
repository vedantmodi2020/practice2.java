package exception_in_java.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class Student_reverse {
    public static void main(String[] args) {
        Student14140 s1 = new Student14140("Vedant", "20BCE2126");
        Student14140 s2 = new Student14140("Varun", "10BCE2146");
        Student14140 s3 = new Student14140("Vivek", "21BCE2126");
        LinkedList<Student14140> list1 = new LinkedList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        Iterator<Student14140> itr = list1.descendingIterator();
        while(itr.hasNext())
        {
            Student14140 s = itr.next();
            if(s.Regno.contains("20BCE"))
            {
                System.out.println("Name : " + s.name);
                System.out.println("Reg No. : " + s.Regno);
            }

        }
    }
}

class Student14140
{
    String name;
    String Regno;


    public Student14140(String name, String Regno) {
        this.name = name;
        this.Regno = Regno;
    }

}