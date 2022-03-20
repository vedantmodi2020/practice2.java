package exception_in_java.Threads_in_java;

import java.util.Scanner;

public class Vedant_20BCE2126 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<100;i++)
                {
                    System.out.println("Thread 1  : "  + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i=101;i<200;i++)
                {
                    System.out.println("Thread 2  : "  + i);
                }
            }
        });
        try {
            t1.start();
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception Handeld");
        }
        try {
            t2.start();
            t2.join();
        } catch (Exception e) {
            System.out.println("Exception Handeld");
        }
    }
}

