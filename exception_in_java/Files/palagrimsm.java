package exception_in_java.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class palagrimsm {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("para1.txt");//write some data
        File f2 = new File("para2.txt");//write some data
        Scanner input1 = new Scanner(f1);
        Scanner input2 = new Scanner(f2);
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        float totalwords=0;
        while(input1.hasNext())
        {
            String q = input1.next();
            arr1.add(q);
            totalwords++;
        }
        while(input2.hasNext())
        {
            String q = input2.next();
            arr2.add(q);
        }
        float count=0;
        for(String k: arr1)
        {
            for(String kk : arr2)
            {
                if(k.equals(kk))
                {
                    count++;
                    break;
                }
            }
        }
        float totalSentence1=0;
        while(input1.hasNextLine())
        {
            String q = input1.nextLine();
            System.out.println(q);
            arr1.add(q);
            totalSentence1++;
        }
        while(input2.hasNextLine())
        {
            String q = input2.nextLine();
            arr2.add(q);
        }
        float count1=0;
        for(String k: arr1)
        {
            for(String kk : arr2)
            {
                if(k.equals(kk))
                {
                    count1++;
                    break;
                }
            }
        }
        System.out.println("The palgarism rate of the assignments is by (words) : " + (count/totalwords)*100 +"%");
        System.out.println("The palgarism rate of the assignments is by (Sentence) : " + (count1/totalSentence1)*100 +"%");
    }
}
