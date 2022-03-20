import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class marksheet {
    public static void main(String[] args) {
    int num ; 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the total number of the Students : ");
    num = input.nextInt();
    result[] array = new result[num];
    for(int i=0; i<num;i++)
    {
        array[i] = new result();
        array[i].setStudent_details();
    }
    int flag=1;
    int choice;
    do{
        System.out.println("Menu-:");
        System.out.println("1. Average Marks of the students");
        System.out.println("2. Passed Students ");
        System.out.println("3. Students with First Class marks");
        System.out.println("4. Students with Distinction Class marks");
        System.out.println("5. Exit \n");
        System.out.println("Please Enter your Choice : ");
        choice = input.nextInt();
        switch (choice)
        {
            case 1:
            for(int i=0;i<num;i++)
            {
                array[i].getdetails();
                array[i].avg_mark();
            }
            break;
            case 2:
            for(int i=0;i<num;i++)
            {
                array[i].getdetails();
                array[i].passfail();
            }
            break;
            case 3:
            for(int i=0;i<num;i++)
            {
                array[i].first();
            }
            break;
            case 4:
            for(int i=0;i<num;i++)
            {
                array[i].distinction();
            }
            break;
            case 5:
            flag=0; 
            break;
        }
    }while (flag==0);
    }
    
    
}

class result
{
    String name;
    String rollno ;
    String[] subject = new String[5];
    String[] subcode = new String[5];
    int[] marks = new int[5];

    public void setStudent_details() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Roll NO. : ");
        rollno = input.nextLine();
        for(int i=0; i<5;i++)
        {
            System.out.println("Enter Subject Name : ");
            subject[i] = input.nextLine();
            System.out.println("Enter Subject Code : ");
            subcode[i] = input.nextLine();
            System.out.println("Enter Marks : ");
            marks[i] = input.nextInt();
        }
    }
    public void avg_mark() {
        int avg=0;
        for(int i=0;i<5;i++)
        {
            avg =+marks[i];
        }
        System.out.println(avg);
    }
    public void getdetails()
    {
        System.out.println("Name : " + name + " Roll NO. : " + rollno);
    }
    public void passfail(){
        int flag=1;
        for(int i=0;i<5;i++)
        {
            if(marks[i]<50)
            {
                System.out.println("The Dtudent is fail in the Subject : " + subject[i] + " Subject Code :  " + subcode[i]);
                flag=0;
            }
        }
        if (flag==1)
        {
            System.out.println("The Student is passed in all the subjects");
            
        }
    }
    public void first()
    {int avg=0;
        for(int i=0;i<5;i++)
        {
            avg =+marks[i];
        }
        if(avg > 60 && avg <80)
        {
            getdetails();
        }
    }
    public void distinction()
    {int avg=0;
        for(int i=0;i<5;i++)
        {
            avg =+marks[i];
        }
        if(avg >80)
        {
            getdetails();
        }
    }

}