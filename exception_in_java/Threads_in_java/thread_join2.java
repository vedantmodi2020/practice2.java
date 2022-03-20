package exception_in_java.Threads_in_java;

public class thread_join2 {
    public static void main(String[] args) throws InterruptedException {
        numbers3 t = new numbers3();
        Thread thr1 = new Thread(new Runnable() {
           @Override
           public void run() {
               t.generate_even();
           }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.generate_odd();
            }
         });
         Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.display();;
            }
         });
        thr1.setPriority(1);
        thr2.setPriority(1);
        thr3.setPriority(10);
        thr1.start();
        thr2.start();
        thr1.join();//thr1 will die here
        thr2.join();//thr2 will die here
        thr3.start();
        System.out.println("Thanks For using our software");
         
    }
}

class numbers3
{
    int[] even = new int[50];
    int[] odd = new int[50];
    public void generate_even() {
        int j=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                even[j]=i;
                j++;
            }
        }
    }
    public void generate_odd() {
        int j=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                odd[j]=i;
                j++;
            }
        }
    }
    public void display() {
        for(int m:even)
        {
            System.out.println("The Even Number from the array : "+m);
        }
        for(int k:odd)
        {
            System.out.println("The odd number from the array : "+k);
        }
    }
}