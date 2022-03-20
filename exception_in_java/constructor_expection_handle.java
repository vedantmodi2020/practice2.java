package exception_in_java;

public class constructor_expection_handle {
    public static void main(String[] args) {
        student10 vedant  = new student10(120, 0);
        try {
            vedant.dividemark();
        } catch (ArithmeticException e) {
            System.out.println("divide by zero is occured");
        }
    }
}
class student10{
    int mark1;
    int mark2;

    public student10(int mark1, int mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public void dividemark() throws ArithmeticException {
        System.out.println(mark1/mark2);
    }
    
}