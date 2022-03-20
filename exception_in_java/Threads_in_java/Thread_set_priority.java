package exception_in_java.Threads_in_java;
public class Thread_set_priority {
    public static void main(String[] args) {
        Priority ob1 = new Priority();
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
        thr1.setPriority(10);
        thr2.setPriority(2);
        thr1.start();
        thr2.start();

    }
}
class Priority
{
    public void gen() {
        for(int i=0;i<30;i++)
        {
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}