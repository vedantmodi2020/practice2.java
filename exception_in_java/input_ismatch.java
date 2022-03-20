package exception_in_java;

import java.util.Scanner;

public class input_ismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numebr : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.println(num1/num2);
        //give input a string istead of numebr to get the folowing exception
    }
}
