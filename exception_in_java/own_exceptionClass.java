package exception_in_java;

import java.util.Scanner;

public class own_exceptionClass {
    public static void main(String[] args) {
        System.out.println("Enter the first Number  : ");
        try {
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            System.out.println("Enter the second numebr : ");
            int num2 = input.nextInt();
            if(num1==num2)
            {
                throw new number2exception();
            }
            System.out.println(num1/num2);
        } catch (Exception e) {
            System.out.println("Both Number cannot be same");
        }
        System.out.println("thanks for using our software");
    }
}

class number2exception extends Exception
{
    
}
