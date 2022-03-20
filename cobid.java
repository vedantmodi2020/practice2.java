import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class cobid {
    public static void main(String[] args) {
        int num;
    Scanner input = new Scanner(System.in);
    System.out.println("total number of people : ");
    num = input.nextInt();
    COVID[] array = new COVID[num];
    for(int i=0;i<num;i++)
    {
        array[i]= new COVID();
        array[i].set_details();
    }
    for(int i=0;i<num;i++)
    {
        
        array[i].get_details();
    }
    count(array);
    fever(array);
    System.out.println("Enter age : ");
    int age;
    age = input.nextInt();
    search_age(age, array);
    


    }
    public static void search_age(int age, COVID[] array) {
        for(int i=0;i<array.length;i++)
    {
        if(array[i].age==age)
        {
            array[i].get_details();
        }
    }
    }
    public static void fever(COVID[] array) {
        for(int i=0;i<array.length;i++)
    {
        if(array[i].symptom.contains("fever"))
        {
            array[i].get_details();
        }
    }
    }
    public static void count(COVID[] array) {
        int count=0;
        for(int i=0;i<array.length;i++)
    {
        if(array[i].flag==0 && array[i].flag1==0)
        {
            count++;
        }
    }
    System.out.println("Total person Who are Vaccinated twice are : " + count);
        
    }
}

class COVID
{
    String name;
    String address;
    String phoneno ;
    int age;
    String date1;
    String date2;
    String adharno ;
    String symptom;
    int flag=0;
    int flag1=0;

    public void set_details() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Address : ");
        address = input.nextLine();
        System.out.println("Enter Phone No. : ");
        phoneno = input.nextLine();
        System.out.println("Enter Age : ");
        age = input.nextInt();
        System.out.println("Enter Date of 1st Dose : ");
        date1 = input.nextLine();
        
        if (date1.isEmpty())
        {
            date1="not taken";
            flag1=1;
        }
        System.out.println("Enter Date of 2nd Dose : ");
        date2 = input.nextLine();
        if(date2.isEmpty())
        {
            date2="not taken";
            flag=1;
        }
        System.out.println("Please enter the symptom : ");
        symptom = input.nextLine();
    }
    public void get_details() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone No. : " + phoneno);
        System.out.println("Age : " + age);
        System.out.println("First dose date : " + date1);
        System.out.println("Second dose date : " + date2);
        System.out.println("Symptoms : " + symptom);
        
    }
}