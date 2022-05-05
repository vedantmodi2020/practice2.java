package exception_in_java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class shopping1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of customer : ");
        int num = input.nextInt();
        shoplist[] array = new shoplist[num];
        ArrayList<shoplist> a1 = new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            array[i] = new shoplist();
            array[i].list();
            a1.add(array[i]);
        }
        Iterator<shoplist> itr = a1.iterator();
        while(itr.hasNext())
        {
            shoplist k = itr.next();
            for(int i=1;i<k.arr1.length;i++)
            {
                for(int j=i+1;j<k.arr1.length;j++)
                {
                    if(k.arr1[i].equals(k.arr1[j]))
                    {
                        System.out.println("There are same elements in the same row : " + k.arr1[0]);
                    }
                }
            }
        }
    }
}
class shoplist
{
    String items;
    static int id=0;
    String[] arr1 = new String[6];
    public void list() {
        Scanner input = new Scanner(System.in);
        id++;
        for(int i=0;i<5;i++)
        {
            arr1[0]=String.valueOf(id);
            System.out.println("Item no." + (i+1)+ " : ");
            items = input.nextLine();
            arr1[i] = items;
        }
        
    }
}