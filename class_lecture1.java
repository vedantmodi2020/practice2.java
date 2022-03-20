

import java.util.Scanner;

public class class_lecture1 {
    public static void main(String[] args) {
        // method one of defining the object
        Students Vedant = new Students("vedant","mumbai");
        Vedant =null;
       // Vedant.viewprofileinfo();
        System.gc();

        
        

    }
}

// anything thst has a unique id and many instances
class Students // user defined data type
{
    // data members
    String name, address;

    public Students() {
    }


    public Students(String name, String address) {
        this.name = name;
        this.address = address;
    }


    // behaviour - action performed by the students with the system
    // defining behaviour using metods
    public void addprofileinf0() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your address: ");
        address = input.nextLine();

    }

    public void viewprofileinfo() {
        System.out.println(name);
        System.out.println(address);
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("i am from he fininalia method");
    }
}
