import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class facluty {
    public static void main(String[] args) {
        faculty1 v1 = new faculty1();
        faculty1 v2 = new faculty1();
        faculty1 v3 = new faculty1();
        faculty1.degree d1 = v1.new degree();
        faculty1.degree d2 = v2.new degree();
        faculty1.degree d3 = v3.new degree();
        d1.set_details();
        d2.set_details();
        d3.set_details();
        d1.get_details();
        d2.get_details();
        d3.get_details();
    }
        
    
}

class faculty1
{
    public String emp_name;
    public String emp_id;

    public class degree{
        String dergree_name;
        String degree_year;
        String awardby;
        public void set_details()
        {
            System.out.println("Please enter the Details for the faculty: ");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the name : ");
            emp_name = input.nextLine();
            System.out.println("Enter the Emplyoee ID : ");
            emp_id = input.nextLine();
            System.out.println("Enter the Degree name : ");
            dergree_name = input.nextLine();
            System.out.println("Enter the Degree year : ");
            degree_year = input.nextLine();
            System.out.println("Enter the Person name who gave the drgree : ");
            awardby = input.nextLine();
        }

        public void get_details(){
            System.out.println("The details of the faculty are : ");
            System.out.println("Faculty Name: " + emp_name);
            System.out.println("Employee ID: " + emp_id);
            System.out.println("Degree Name: " +dergree_name);
            System.out.println("Degree Year: " +degree_year);
            System.out.println("Awarded By: " +awardby);
        }

    }
}