package exception_in_java.Threads_in_java;

import java.util.Scanner;

public class thread_wait_notify  {
    public static void main(String[] args) throws InterruptedException {
        account4 a1 = new account4(2000);
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a1.withdraw(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a1.withdraw(20000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Thread thr3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a1.deposit(60000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        thr1.start();
        thr2.start();
        
        thr3.start();
        thr1.join();
        thr2.join();
        System.out.println("Current balance : " + a1.balance);
    }
}

class account4
{
    public int balance;


    public account4(int balance) {
        this.balance = balance;
    }
    public synchronized void withdraw(int withdraw1) throws InterruptedException {
        System.out.println("How are you " + Thread.currentThread().getId());
        boolean x = true;
        while(withdraw1>this.balance) 
        {
            
            System.out.println("Thread is waiting");
            wait();
        }
        System.out.println("withdrawl happening " + Thread.currentThread().getId());
        this.balance = this.balance - withdraw1;
    }
    public synchronized void deposit(int deposit1) throws InterruptedException {
        System.out.println("this is deposit " + Thread.currentThread().getId());
        this.balance = this.balance + deposit1;
        System.out.println("I am notifying " + Thread.currentThread().getId());
        //notify();
        notifyAll();
    }
}

//when multiple thread is waiting for the single object
// then we use notify all to notify all the wait threads
