package exception_in_java.Threads_in_java;

public class Thread_two {
    public static void main(String[] args) {
        number12 ob1 = new number12();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.prime1();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.prime101();
            }
        });
        thr1.start();
        thr2.start();
    }
}

class number12
{
    public void prime1() {
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
                System.out.println("The Prime Number from 1 to 100  : " + i);
            }
        }
    }
    public void prime101() {
        for(int i=100;i<200;i++)
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
                System.out.println("The Prime Number from 101 to 200  : " + i);
            }
        }
    }
}
