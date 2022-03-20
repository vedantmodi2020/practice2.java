package exception_in_java.Threads_in_java;

public class thread_priority_sleep {
    public static void main(String[] args) {
        evenodd o1  =new evenodd();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    o1.generate_even();
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.generate_odd();
            }
        });
        thr1.setName("Vedant");
        thr1.setPriority(7);
        thr2.setPriority(1);
        
        thr1.start();
        thr1.interrupt();
        //thr2.start();

        System.out.println("thanks for using our software");
    }
}
//when the tread goes to sleep the next thread will start executing without intrretup
//when using intretup always use exception 

class evenodd
{
    public void generate_even() throws InterruptedException {
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
            //if(i%2==0)
            /*{
                System.out.println(Thread.currentThread().isAlive());
                System.out.println(Thread.currentThread().toString());
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
                System.out.println("Genereate Even Priority is : "+Thread.currentThread().getPriority());
                //sleep pause the executation of the thread
                System.out.println("The even Number is  : " + i);
            }*/
            try{
             if(i==5)
            {
                System.out.println("Thread is entering sleep mode");
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }catch(InterruptedException e)
        {
            System.out.println("Exception handeld Here");
        }
        
        }
    }
    public void generate_odd() {
        for(int i=0;i<100;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Genereate Odd Priority is : "+Thread.currentThread().getPriority());
                System.out.println("The odd Number is  : " + i);
            }
            
        }
    }
}