package exception_in_java;

import java.util.Scanner;



public class handle_arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numebr : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        try {
            System.out.println(num1/num2);
        } catch (Exception e) {
            System.out.println("Divide by zero not allowed");
        }
        System.out.println(" thank you for using our software");
        //given num1 anything andd num2 0 to get artimetic exception
    }
}
