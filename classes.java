import java.text.Normalizer.Form;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

import org.w3c.dom.stylesheets.StyleSheetList;

public class classes {
    public static void from_vellore(University k[]){
        for(int i=0;i<k.length;i++)
        {
            if(k[i].uni_add.contains("vellore") || k[i].uni_add.contains("Vellore") )
            {
                System.out.println(k[i].name + " is from Vellore");
            }
        }
    }
    public static void name_sort(University k[])
    {
        University temp = new University();
        for(int i=0;i<k.length;i++)
        {
            for(int j=0;j<k.length-i;j++)
            {
                if(k[j].name.compareTo(k[j + 1].name)>0)
                {
                    temp = k[j];
                    k[j] = k[j+1];
                    k[j+1] = k[j];
                }
            }
        }
        for(University m:k)
        {
            System.out.println(m.name+"\n"+m.Regno+"\n"+m.uni_add);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter total numbers of students in the university : ");
        num = input.nextInt();
        University array[] = new University[num];
        for(int i=0;i<num;i++)
        {
            array[i] = new University();
            array[i].set_details();
        }
        
        for(int i=0;i<num;i++)
        {
            array[i].get_details() ;
        }
        for(int i=0;i<num;i++)
        {
            array[i].uni();
        }
        
        from_vellore(array);
        University.display_total_students() ;
        
    }
}

class University{
    public String name;
    public String Regno ;
    public static String uni_add="Vellore vit" ;
    public static int count =0;
    public University()
    {
        count++;
    }
     public void set_details(){
         Scanner input = new Scanner(System.in);
         System.out.println("please enter your name : ");
         name = input.nextLine();
         System.out.println("Please enter your Regno. : ");
         Regno = input.nextLine();
         

     }

     public void get_details(){
        System.out.println(name +"\n"+ Regno +"\n"+ uni_add); ;
     }
     public void uni(){
         System.out.println("the address of the university is : " + uni_add);
     }
     public static void display_total_students(){
         System.out.println("the total number of Students in the university is : " + count);
     }
     
}
