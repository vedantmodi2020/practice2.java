import java.util.Scanner;

public class food {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total no. of Customer : ");
        num = input.nextInt();
        fav_food[] array = new fav_food[num];
        for(int i=0; i<num;i++)
        {
            array[i] = new fav_food();
            array[i].food_details();
        }
        fav_food.get_details(array);
        
        }
    }




class fav_food
{
    static String customer_name;
    String food;
    public static String fav_food="";


    public void food_details() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        customer_name = input.nextLine();
        System.out.println("Enter Favourite food : ");
        food = input.nextLine();
        if(!fav_food.contains(food)){
            fav_food+=food+"," ;
        }
        
    }
    public static void get_details(fav_food[] array) {
        String[] array1 = fav_food.split(";");
        for(String s:array1)
        {
            System.out.println("Food Name : " + s);
            System.out.println("Common customer : ");
            for(int i=0;i<array.length;i++)
            {
                if(array[i].food.equals(s))
                {
                    System.out.println(array[i].customer_name);
                }
            }
        }
    }
}