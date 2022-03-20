package exception_in_java.Threads_in_java;
import java.io.*;

public class Thread_memory_error {
    public static void main(String[] args)
    {
        final SharedClass s1 = new SharedClass();
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                s1.increment();
            }
        };
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s1.decrement();
            }
        };
        t1.start();
        t2.start();
    }
}
class SharedClass {
    static int i=10;
    void increment()
    {
        for(int j=0;j<50;j++)
        {
            i=i+1;
            System.out.println("i after increment "+i);
        }
    }
    void decrement()
    {
        for(int j=0;j<50;j++)
        { 
            i=i-1;
            System.out.println("i after decrement "+i);
        }
    }
}
  