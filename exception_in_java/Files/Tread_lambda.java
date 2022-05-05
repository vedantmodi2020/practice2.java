package exception_in_java.Files;

public class Tread_lambda {
    public static void main(String[] args) {
        Thread thr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                test t1 = new test() {
                    @Override
                    public void display() {
                        for (int i = 2; i < 100; i++) {
                            int count = 0;
                            for (int j = 1; j <= Math.sqrt(i); j++) {
                                if (i % j == 0) {
                                    count++;
                                }
                            }
                            if (count < 2) {
                                System.out.println("The Prime Number : " + i);
                            }
                        }
                    }
                };
                t1.display();
            }
        });
        Thread thr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                test t2 = new test() {
                    @Override
                    public void display() {
                        for(int i=0;i<100;i++)
                        {
                            if(i%2==0)
                            {
                                System.out.println("Square of even Number is : " + i*i);
                            }
                        }
                    }
                };
                t2.display();
            }
        });
        thr1.start();
        thr2.start();
    }
}

interface test {
    void display();
}
