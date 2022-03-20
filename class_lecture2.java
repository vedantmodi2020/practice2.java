

import java.util.Scanner;

class Student // user defined data type
{
    // data members
    String name, address;
    int regno  ;

    // behaviour - action performed by the students with the system
    // defining behaviour using metods
    public void addprofileinf0() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your address: ");
        address = input.nextLine();
        System.out.println("Please netert your reg no. : ") ;
        regno = input.nextInt();

    }

    public void viewprofileinfo() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(regno);
    }
}

public class class_lecture2 {
    public static void main(String[] args) {
        Student[] array;
        array = new Student[2];
        for (int i = 0; i < 2; i++) {
            array[i] = new Student();
        }
        for (int i = 0; i < 2; i++) {
            array[i].addprofileinf0();
        }
        for (int i = 0; i < 2; i++) {
            array[i].viewprofileinfo();
        }

    }
}
