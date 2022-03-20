package exception_in_java.Threads_in_java;

public class Thread_interupt2 {
    public static void main(String[] args) {
        number120 ob1 = new number120();
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
        thr1.interrupt();
        thr2.start();
        thr2.interrupt();
    }
}

class number120
{
    public void generate_even() throws InterruptedException {
        int count =0;
        for(int i=0;i<100;i++){
            if(i%2==0)
            {
                System.out.println("The even Numebr is : "  + i);
                count++;
            }
            try{
                if(count ==6)
                {
                    System.out.println("The Thread is Sleeping");
                    Thread.sleep(10000);
                }
            }catch(InterruptedException e)
            {
                System.out.println("The Exception is handeld here");
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
            try{
            if(count ==6)
            {
                System.out.println("The Thread is Sleeping");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("The Exception is handeld here");
        }
        }

    }
}
