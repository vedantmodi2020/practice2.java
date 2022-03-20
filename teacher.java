import java.util.Scanner;



public class teacher {
    public static void main(String[] args) {
        Scanner inpuScanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the total num of facultys : ");
        num = inpuScanner.nextInt();
        faculty2[] array = new faculty2[num];
        for(int i=0;i<num;i++){
            array[i] = new faculty2();
            array[i].set_deatils();
        }
        for(int i=0;i<num;i++){
            
            array[i].get_details();
        }
    }
}

class faculty2
{
    String name;
    String empid;
    int num_dergree;
    degree[] d = new degree[10];

    public void set_deatils() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee name : ");
        name = input.nextLine();
        System.out.println("Enter the employee id : " );
        empid = input.nextLine();
        System.out.println("Enter the total number of degrees  : ");
        num_dergree = input.nextInt();
        for(int i=0;i<num_dergree;i++)
        {
            System.out.println("Enter the degree details : ");
            d[i] = new degree();
            d[i].set_deg_details();
        }
    }
    class degree
    {
        String dname;
        String yeaar;
        String university_name;
    
        public void set_deg_details() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter degree name : ");
            dname = input.nextLine();
            System.out.println("Enter the award year : ");
            yeaar = input.nextLine();
            System.out.println("enter the university name : ");
            university_name = input.nextLine();
        }

        public void get_deg_details() {
            System.out.println("Degree name : " + dname);
            System.out.println("Awarded year  : " + yeaar);
            System.out.println("University name : "  + university_name);
        }
    }

    public void get_details() {
        System.out.println("Name  : " + name);
        System.out.println("Employee ID : " + empid);
        System.out.println("Degree details  : ");
        for(int i=0; i<num_dergree;i++)
        {
            System.out.println((i+1) + ". Degree : ");
            d[i].get_deg_details();
        }
    }
}