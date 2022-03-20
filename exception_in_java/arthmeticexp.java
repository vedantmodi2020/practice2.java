package exception_in_java;

import java.util.Scanner;

public class arthmeticexp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numebr : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.println(num1/num2);
        //given num1 anything andd num2 0 to get artimetic exception
    }
}
