package exception_in_java.Threads_in_java;
//anonymus object in the array
public class thread3 {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Runnable() {
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
        });
        Thread thr2 = new Thread(new Runnable() {
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
        });
        thr1.start();
        thr2.start();
        for(int i=201;i<300;i++)
        {
            
                System.out.println("The number from main method  : " + i);
            
        }
        System.out.println("Thanks for using our software");
    }
}

