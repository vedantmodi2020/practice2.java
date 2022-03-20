package exception_in_java.Threads_in_java;
public class Thread_prime {
    public static void main(String[] args) {
        prime1 o1 = new prime1();
        Thread thr1 = new Thread(o1);
        thr1.start();
        System.out.println("Thanks for usong our software");
    }
}
class prime1 extends Thread
{
    @Override
    public void run() {
        
        for(int i=2;i<100;i++)
        {
            int count=0;
            for(int j=1;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count<2)
            {
                System.out.println("The Prime Number : " + i);
            }
        }
    }
}