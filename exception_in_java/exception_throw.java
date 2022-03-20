package exception_in_java;

import java.util.Scanner;

public class exception_throw {
    public static void main(String[] args) {
        System.out.println("Enter the first Number : ");
       try {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the second number :  ");
        int num2 = input.nextInt();
        if(num1==num2)
        {
            throw new ArithmeticException();
        }
        System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("both numebr cannot be same ");
        }
        System.out.println("thanks for using our software");
    }
}
