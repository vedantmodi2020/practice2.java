package exception_in_java.Threads_in_java;

public class thread_syncronizze {
    public static void main(String[] args) throws InterruptedException {
        account1 a1 = new account1(200000);
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<50;i++)
                {
                    a1.withdraw(100);
                }
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<50;i++)
                {
                    a1.withdraw(100);
                }
            }
        });

        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
        System.out.println(a1.Balance);
    }
}

class account1
{
    public int Balance;

    public account1(int Balance) {
        this.Balance = Balance;
    }
    public synchronized void withdraw(int withdraw_amount) {
        this.Balance = this.Balance - withdraw_amount;
    }
}