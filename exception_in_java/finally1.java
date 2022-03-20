package exception_in_java;

import java.util.Scanner;

public class finally1 {
    public static void main(String[] args) {
        System.out.println("Enter the first numebr : ");
        try {
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            System.out.println("Enter the Second number : ");
            int num2 = input.nextInt();
            if(num1==num2)
            {
                throw new number2exception1();
            }
            System.out.println(num1/num2);
        } catch (number2exception1 e) {
            System.out.println("Both Number cannot be same");
        } finally{
            System.out.println("releasing resource done");
        }
        System.out.println("Thanks for using our software");
    }
}
class number2exception1 extends Exception
{
}


//Nested Try Catch Blocks
//try
//{
//Code
//try
//{
//code
//}
//catch()
//{
//code
//}
//}
//catch()
//{
//code
//}