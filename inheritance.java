import java.util.Scanner;

public class inheritance {
    public static void main(String[] args) {
        desiple ram = new desiple();
        ram.set_details();
        ram.null_add_name();
        ram.get_student_details();
        faculty satish = new faculty();
        satish.set_faculty_details();
        satish.null_add_name();
        satish.get_faculty_details();
    }
}
class person 
{
    String name;
    String address;
    String phone;
    public void null_add_name(){
        if(name.isEmpty())
        {
            System.out.println("please enter your name");
        }
        else if(address.isEmpty())
        {
            System.out.println("please enter your address");
        }
        else
        {
            System.out.println("Welcome " + name + " and your address is " + address);
        }
    }
}

class desiple extends person
{
    String regno ;
    
    public void set_details(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your regno. : ");
        regno = input.nextLine();
        System.out.println("Enter your name : ");
        name = input.nextLine();
        System.out.println("Enter your address : ");
        address = input.nextLine();
        System.out.println("Enter your phone number : ");
        phone = input.nextLine();
    }
    
    public void get_student_details(){
        System.out.println(name + address + regno + phone);
    }
}

class faculty extends person
{
    String empid;
    String designation;
    String cabin_no ;

    public void set_faculty_details(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your empid : ");
        empid = input.nextLine();
        System.out.println("Enter your name : ");
        name = input.nextLine();
        System.out.println("Enter your address : ");
        address = input.nextLine();
        System.out.println("Enter your phone number : ");
        phone = input.nextLine();
        System.out.println("Enter your designation : ");
        designation = input.nextLine();
        System.out.println("Enter your Cabin number : ");
        cabin_no = input.nextLine();
    }
    
    public void get_faculty_details(){
        System.out.println(empid + name + address + phone + designation + cabin_no);
    }

}
class admin extends person
{
    String labno;
    public void set_admindeatils()
    {
    }
    public void get_admindetails()
    {

    }

}