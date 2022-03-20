package exception_in_java.Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class file_thread_even_odd {
    public static void main(String[] args) throws InterruptedException {
        gen3 obj = new gen3();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.even();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.odd();
            }
        });
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    File file = new File("even.txt");
                    File file1 = new File("odd.txt");
                    FileReader sat = new FileReader(file);
                    FileReader sat1 = new FileReader(file1);
                    int x;
                    int y;
                    while ((x = sat.read()) != -1) {
                        System.out.println("Even : " + x);
                    }
                    while ((y = sat1.read()) != -1) {
                        System.out.println("odd : " + y);
                    }

                } catch (Exception e) {
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

class gen3 {
    public void even() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    File even = new File("even.txt");
                    FileWriter fout = new FileWriter(even, true);
                    fout.write(i);
                    System.out.println("File write successfull");
                    fout.close();
                } catch (Exception e) {
                    System.out.println("Exception handeld here");
                    // TODO: handle exception
                }
            }
        }
    }

    public void odd() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                try {
                    File odd = new File("odd.txt");
                    FileWriter fout = new FileWriter(odd, true);
                    fout.write(i);
                    System.out.println("File write successfull");
                    fout.close();
                } catch (Exception e) {
                    System.out.println("Exception handeld here");
                    // TODO: handle exception
                }
            }
        }
    }
}
