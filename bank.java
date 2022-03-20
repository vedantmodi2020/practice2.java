import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class bank {
    public static void main(String[] args) {
        String password1;
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the bank\n");
        System.out.println("please enter the details for the admin : ");
        admin101 m = new admin101();
        m.getadmin_details();
        System.out.println("Please enter the total number of customers : ");
        int num = input.nextInt();
        bank101[] array = new bank101[num];
        for(int i=0;i<num;i++)
        {
            array[i]= new bank101();
            array[i].customer();
        }
        int flag=0;
        do{
            System.out.println("Welcome to the login page !!");
            System.out.println("Enter 1 to Login as Customer and 0 to Login as Admin and 11 for Exit");
            int kk;
            kk = input.nextInt();
            switch (kk) {
                case 0:System.out.println("Welcome to the Admin login Page");
                       System.out.println("Please enter your Password : ");
                       password1 = input.nextLine();
                       admin_details("mahabharata",m, array);
                    
                    break;
                case 1:edit(array);
                break;

                case 11: 
                flag=1;
                break;
            
                default:
                    break;
            }
        }while(flag==0);
        
        
        
        
        
    }
    public static void edit(bank101 k[]){
        Scanner input = new Scanner(System.in);
        String name_check;
        int exit=0;
        int choice;
        System.out.println("Welcome to Customer login\n");
        System.out.println("Please enter your Name : ");
        name_check = input.nextLine();
        for(int i=0;i<k.length;i++)
        {
            if(k[i].name.equals(name_check))
            {
                System.out.println("Welcome " + k[i].name);
                System.out.println("Please enter your Pin : ");
                String code = input.nextLine();
                if(code.equals(k[i].customer_pin))
                {
                    do{
                        System.out.println("Menu:-");
                        System.out.println("1. Display Details : ");
                        System.out.println("2. Edit Details : ");
                        System.out.println("3. Money Withdraw And Deposit : ");
                        System.out.println("4. Exit ");
                        System.out.println("Please enter your choice : ");
                        choice = input.nextInt();
                        switch(choice)
                        {
                            case 1 : k[i].display_details();
                            break; 
                            case 2 : k[i].edit_details();
                            break;
                            case 3 : k[i].desposit_Withdraw();
                            break;
                            case 4 : exit=1;
                            
                        }

                    }while(exit==0);
                }
                else
                {
                    System.out.println("Wrong pin");
                }
            }
            else
            {
                System.out.println("Sorry we have no customer by this name ");
            }
        }
    }
    public static void admin_details(String pass,admin101 k,bank101[] lm)
    {
        int choice;
        Scanner input = new Scanner(System.in);
        int exit=0;
        if(pass.equals(k.password))
        {
            do{
                System.out.println("Menu:-");
                System.out.println("1. Display Details of the customer : ");
                System.out.println("2. Display Customer Balance Less than 1000 : ");
                System.out.println("3. Exit ");
                System.out.println("Please enter your choice : ");
                choice = input.nextInt();
                switch(choice)
                {
                    case 1 : {
                        System.out.println("The details of all the customers are : ");
                        for(int i=0;i<lm.length;i++)
                        {
                            lm[i].display_details();
                        }
                        break;
                    }
                    case 2 : 
                    {
                        System.out.println("The details of the customers whose balance is less than 1000 are : ");
                        for(int i=0;i<lm.length;i++)
                        {
                            if(lm[i].Balance<1000)
                            {
                                lm[i].display_details();
                            }
                        }
                        break;
                    }
                    case 3 : exit=1;
                    
                }

            }while(exit==0);
        }
    }
}
class admin101
{
    String name;
    String password;
    String Address;
    String email_id;
    String phone;
    public void getadmin_details() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Address : ");
        Address = input.nextLine();
        System.out.println("Enter Email ID : ");
        email_id = input.nextLine();
        System.out.println("Enter Phone NO. : ");
        phone = input.nextLine();
        System.out.println("Enter Password : ");
        password = input.nextLine();
    }
}

class bank101
{
    String name;
    String password;
    String Address;
    String email_id;
    String phone;
    String customer_pin;
    int Balance;
    public void customer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Address : ");
        Address = input.nextLine();
        System.out.println("Enter Email ID : ");
        email_id = input.nextLine();
        System.out.println("Enter Phone NO. : ");
        phone = input.nextLine();
        System.out.println("Enter Pin : ");
        customer_pin = input.nextLine();
        System.out.println("Please desposit Some money Into your Account  :  ");
        Balance = input.nextInt();
    }
    public void display_details(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + Address);
        System.out.println("Phone No. : " + phone);
        System.out.println("Email ID : " + email_id);
        System.out.println("Current Balance  : " + Balance);
    }
    public void edit_details(){
        System.out.println("Welcome to Edit details\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Address : ");
        Address = input.nextLine();
        System.out.println("Enter Email ID : ");
        email_id = input.nextLine();
        System.out.println("Enter Phone NO. : ");
        phone = input.nextLine();
        
    }
    public void desposit_Withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Deposit and 0 for Withdraw : ");
        int response = input.nextInt();
        int money;
        if(response==1)
        {
            System.out.println("Please enter the amount you want to deposit : ");
            money = input.nextInt();
            Balance = money + Balance;
            System.out.println("Current Balance  : " + Balance);
        }
        else if(response==0)
        {
            System.out.println("Please enter the amount you want to withdraw : ");
            money = input.nextInt();
            if(money>Balance)
            {
                System.out.println("Insuffecient Amount");
            }
            else
            {
                Balance = Balance - money;
                System.out.println("Current Balance  : " + Balance);
            }
        }
    }
    
}
