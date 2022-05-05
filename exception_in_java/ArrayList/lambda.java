package exception_in_java.ArrayList;

import java.io.IOException;

public class lambda {
    public static void main(String[] args) throws IOException{
        calc addition = (a,b)->{System.out.println("The addition is : " + (a+b));};
        calc subtraction = (a,b)->{System.out.println("The addition is : " + (a+b));};
        calc multiplication = (a,b)->{System.out.println("The addition is : " + (a+b));};
        calc division = (a,b)->{System.out.println("The addition is : " + (a+b));};
        operate(19,23, addition);
    }
    public static void operate(int a ,int b, calc c) {
        c.calculate(a, b);
    }
}


interface calc
{
    void calculate(int a,int b);
}