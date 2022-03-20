package exception_in_java.Threads_in_java;

public class Thread_name {
    public static void main(String[] args) {
        name ob1 = new name();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob1.Genereate();
            }
        });
        thr1.setName("Vedant Modi");
        thr1.start();
    }
}

class name
{
    public void Genereate() {
        for(int i=0;i<20;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
