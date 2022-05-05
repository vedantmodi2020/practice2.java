package exception_in_java.Threads_in_java;

import java.util.Scanner;

public class quiz_threads {
    public static void main(String[] args) {
        
    }
}

class quiz{
String Answer1;
String Answer2;
String Answer3;

    public void quiz1() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name : ");
        Answer1 = input.nextLine();
        System.out.println("What is your Motto : ");
        Answer2 = input.nextLine();
        System.out.println("Total marks In the last sem : ");
        Answer3 = input.nextLine();
        
    }
}