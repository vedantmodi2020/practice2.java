package exception_in_java;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class two_expection_handle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numebr : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        try {
            System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input");
        }
        System.out.println(" thank you for using our software");
        //given num1 anything andd num2 0 to get artimetic exception
        // using just exception keyword inside the bracket of catch
        // it can catch all the exception and is a base exception
    }
}
