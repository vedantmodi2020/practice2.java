package exception_in_java.Threads_in_java;

public class Thread_2_sleep {
    public static void main(String[] args) {
        number121 ob1 = new number121();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob1.generate_even();
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob1.generate_odd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thr1.start();
        thr2.start();
    }
}

class number121
{
    public void generate_even() throws InterruptedException {
        int count =0;
        for(int i=0;i<100;i++){
            if(i%2==0)
            {
                System.out.println("The even Numebr is : "  + i);
                count++;
            }
            if(count==6)
            {
                System.out.println("The Thread is Sleeping");
                
                Thread.sleep(10000);
                System.out.println("Thread is awake");
            }
        }
    }

    public void generate_odd() throws InterruptedException {
        int count =0;
        for(int i=100;i<200;i++){
            if(i%2!=0)
            {
                System.out.println("The odd Numebr is : "  + i);
                count++;
            }
            if(count ==6)
            {
                System.out.println("The Thread is Sleeping");
                
                Thread.sleep(10000);
                System.out.println("Thread is awake");
            }
        }

    }
}
