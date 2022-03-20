package exception_in_java.Threads_in_java;

public class Thread_odd {
    public static void main(String[] args) {
        odd_gen o1 = new odd_gen();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.generate_odd();
            }
        });
        thr1.start();
        System.out.println("Thanks For Using our software");
    }
}

class odd_gen
{
    public void generate_odd() {
        for(int i=0;i<100;i++)
        {
            if(i%2!=0)
            {
                System.out.println("The odd number  : " + i);
            }
        }
    }
}