package exception_in_java.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<>();
        country.put("USA","Washington D. C.");
        country.put("China","Bejing");
        country.put("Japan","Tokyo");
        country.put("India","Delhi");
        country.put("South Korea","Seoul");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country name: ");
        String cname = input.nextLine();
        boolean t = false;
        for(Map.Entry<String,String> i : country.entrySet())
        {
            if(i.getKey().equals(cname))
            {
                System.out.println("The Capital of " + i.getKey() + " is : " + i.getValue());
                t= true;
            }
        }
        if(t==false)
        {
            System.out.println("The Country is not registered in the Database");
        }
        
    }
}
