package exception_in_java.Threads_in_java;

public class thread2 {
    public static void main(String[] args) {
        // an example without thread
        //print all the even number btw 1 and 100
        //print all the odd number btw 101 and 200
        //print all the numers btw 201 and 300
        //main itself is a thread
        
        even1 o1 = new even1();
        odd1 o2  = new odd1();
        Thread thr1 = new Thread(o1);
        Thread thr2 = new Thread(o2);
        thr1.start();
        thr2.start();
        for(int i=201;i<300;i++)
        {
            
                System.out.println("The number from main method  : " + i);
            
        }
        System.out.println("Thanks for using our software");
    }
}

class even1 implements Runnable {


@Override
public void run() {
    for(int i=1;i<100;i++)
    {
        if(i%2==0)
        {
            System.out.println("The Even number  : " + i);
        }
    }
    
}
}
class odd1 implements Runnable {


    @Override
    public void run() {
        for(int i=101;i<200;i++)
        {
            if(i%2!=0)
            {
                System.out.println("The odd number  : " + i);
            }
        }
    }
    }


