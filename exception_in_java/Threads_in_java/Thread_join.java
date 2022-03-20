package exception_in_java.Threads_in_java;

public class Thread_join {
    public static void main(String[] args) throws InterruptedException {
        numbers2 obj = new numbers2();
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.Genereate_num();
            }
        });
        thr1.setPriority(10);
        thr1.start();
        thr1.interrupt();
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.Genereate_num2();
            }
        });
        thr2.setPriority(1);
        thr2.start();
        thr1.join();
        thr2.join();
        //printing the thanks for statement at last after the execution 
        //of the 2 threads using the join function
        System.out.println("Thanks for using are software");
        
    }
}


class numbers2
{
    
    public void Genereate_num() {
        for(int i=1;i<=100;i++)
        {
            System.out.println("The numbers starting from 1 to 100 : " + i);
        }
    }
    public void Genereate_num2() {
        for(int i=101;i<+200;i++)
        {
            System.out.println("The numbers from 100 are : " + i);
        }
    }
}