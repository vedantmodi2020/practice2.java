package exception_in_java.Threads_in_java;

import java.util.Scanner;

public class thread_matrix {
    public static void main(String[] args) throws InterruptedException {
        matrix m1 = new matrix();
        matrix m2 = new matrix();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                m1.get_matrix();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                m2.get_matrix();
            }
        });
        int[][] sum = new int[3][3];
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        sum[i][j] = m1.mat[i][j] + m2.mat[i][j];
                    }
                }

                for(int[] k : sum)
                {
                    for(int kk:k)
                    {
                        System.out.print(" "+ kk);
                    }
                    System.out.println();
                }
            }
        });
        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
        thr3.start();
    }
}

class matrix{
    int[][] mat = new int[3][3];
    public void get_matrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Matrix details : ");
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j] = input.nextInt();
            }
        }
    }
}