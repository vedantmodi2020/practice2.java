package exception_in_java.Threads_in_java;

public class Thread_anonymus {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    System.out.println("Hello World");
                }
            }
        });
        thr1.start();
    }
}
