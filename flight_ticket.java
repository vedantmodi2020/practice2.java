import java.util.Scanner;

public class flight_ticket {
    public static void list_pass_des(flight k[]){
        System.out.println("The passengers travelling to US UK and Canada are : ");
        for(int i=0;i<k.length;i++)
        {
            if("us uk canada".contains(k[i].destination))
            {
                System.out.println("Name : "+ k[i].name +"\nFlight Name : " +k[i].flight_name +"Ticket price"+ k[i].price);

            } 
        }
        System.out.println("The passengers travelling to Singapore Malayisa and Taiwan are : ");
        for(int i=0;i<k.length;i++)
        {
            if("singapore malayisa taiwan".contains(k[i].destination))
            {
                System.out.println("Name : "+ k[i].name +"\nFlight Name : " +k[i].flight_name +"Ticket price"+ k[i].price);

            } 
        }

    }
    public static void flight_id(flight k[],String l)
    {
        System.out.println("The list of passengers going in flight " + l+ " are : ");
        for(int i=0;i<k.length;i++)
        {
            
            if(k[i].flight_name.contains(l))
            {
                System.out.println(k[i].name);
            }
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of tickets you want to book :");
        num = input.nextInt();
        flight[] array = new flight[num];
        for(int i=0;i<num;i++)
        {
            array[i]=new flight();
            array[i].passenger_details();
            array[i].Destination();
        }
        
        String code_check;
        for(int i=0;i<num;i++)
        {
            int flag=0;
            System.out.println("please enter the flight code to get the details of Passenger "+(i+1) +" : ");
            code_check = input.nextLine();
            
            while(flag==0)
            {
                if(code_check.equals(array[i].code))
                {
                    System.out.println("\n*****Thank You for Using Online Tickt Booking*****\n");
                    System.out.println("The details for your flight are: ");
                    array[i].get_flight_details();
                    flag=1;
                }
                else
                {
                    System.out.println("Please enter the code : ");
                    code_check = input.nextLine();
                }
            }
        }
        list_pass_des(array);
        System.out.println("Please enter the flight id to check all the passengers name : ");
        String check1 = input.nextLine();
        flight_id(array, check1);

    }
}
class flight
{
    String name;
    String age;
    String code;
    String DOB;
    String destination;
    int price =0;
    String flight_name;
    public void passenger_details()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        name = input.nextLine();
        System.out.println("Please enter your Age:");
        age = input.nextLine();
        System.out.println("Please enter your Passenger code:");
        code = input.nextLine();
        System.out.println("Please enter your DOB:");
        DOB = input.nextLine();
        System.out.println("Please enter your Destination:");
        destination = input.nextLine();
    }

    public void Destination()
    {
        if("us uk canada".contains(destination))
        {
            price = 75000 + (75000*20)/100 ;
            flight_name = " Boeing 703";
        }
        else if ("singapore malayisa taiwan".contains(destination))
        {
            price = 3500 + (3500*10)/100 ;
            flight_name = "Lufthansa 303";
        }
        else
        {
            flight_name="Sorry for the inconvienence currently we have no flight available for this destination";
        }
    }
    public void get_flight_details()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age : " + age);
        System.out.println("DOB : " + DOB);
        System.out.println("Destination : " + destination);
        System.out.println("Flight Name  : " + flight_name);
        System.out.println("Ticket Price : " + price);
    }
}
