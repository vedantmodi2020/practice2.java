package exception_in_java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class unreachableissue {
    public static void main(String[] args){
        System.out.println("Enter the first number");
        try
        {
        Scanner sc = new Scanner(System.in);
        int firstnumber = sc.nextInt();
        System.out.println("Enter the second number");
        int secondnumber = sc.nextInt();
        System.out.println(firstnumber/secondnumber);
        }
        catch(Exception e)
        {
        System.out.println("All Exceptions are Caught Here");
        }
        //catch(ArithmeticException e)
        {
        System.out.println("Arithmetic Exception has occurred");
        }
        System.out.println("Thanks for using our Software");
        }
}
