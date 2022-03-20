import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your registration number : ");
        String regis = input.nextLine();
        try{
            if(regis.equals("20BCE2126")){
                throw new Exceptionreg("This registration number is already taken ");
            }
            System.out.println(regis);
        }
        catch(Exceptionreg e){
            System.out.println(e.getMessage());
        }
    }

}

class Exceptionreg extends Exception{
    public Exceptionreg(String k){
        super(k);
    }
}
