package exception_in_java.Threads_in_java;

public class Threads_methods {
    public static void main(String[] args) {
        gen11 ob1 = new gen11();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.gen();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.gen();
            }
        });
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.gen();
            }
        });
        thr1.setName("Vedant");
        thr2.setName("Varun");
        thr3.setName("Palak");
        thr1.setPriority(10);
        thr2.setPriority(8);
        thr3.setPriority(9);
        thr1.start();
        thr2.start();
        thr3.start();
    }
}

class gen11
{
    public void gen() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread ID  : " + Thread.currentThread().getId());
            System.out.println("Thread Alive Status : " + Thread.currentThread().isAlive());
            System.out.println("Thread Information  : " + Thread.currentThread().toString());
        }
    }
}