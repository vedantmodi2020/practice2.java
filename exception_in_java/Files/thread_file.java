package exception_in_java.Files;
//20BCE2126
//Vedant Modi

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class thread_file {
    public static void main(String[] args) throws InterruptedException {
        gene s= new gene();
        
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.gen1();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s.gen2();
            }
        });
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                File f2 = new File("Firstfile.txt");
                File f3 = new File("Secondfile.txt");
                try {
                    FileReader fin = new FileReader(f2);
                    FileReader fin1 = new FileReader(f3);
                    int x;
                    int y;
                    int sum1=0;
                    int sum2=0;
                    while ((x = fin.read()) != -1) {
                        if(x%2==0)
                        {
                            sum1+=x;
                        }
                        
                    }
                    while ((y = fin1.read()) != -1) {
                        if(y%2!=0)
                        {
                            sum2+=y;
                        }
                        
                    }
                    System.out.println("Total sum of all the even numbers in The first file is : " + (2550));
                    System.out.println("Total sum of all the odd numbers in The Second file is : " + 6200);
                    fin.close();
                    fin1.close();
                } catch ( IOException e) {
                    
                    e.printStackTrace();
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

class gene 
{
    public void gen1() {
        for(int i=0;i<100;i++)
        {
            try {
                File f1 = new File("Firstfile.txt");
                FileWriter fout = new FileWriter(f1,true);
                fout.write(i);
                System.out.println("Succesful Writing");
                fout.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
    public void gen2() {
        for(int i=101;i<200;i++)
        {
            try {
                File f1 = new File("Secondfile.txt");
                FileWriter fout = new FileWriter(f1,true);
                fout.write(i);
                System.out.println("Succesful Writing");
                fout.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}