import java.util.Scanner;

public class DuplicateWord {  
    public static void main(String[] args) {  
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        size = input.nextInt();
        int array[]= new int[size];
        System.out.println("Please enter the elemnets of the array : ");
        for(int i=0;i<size;i++)
        {
            array[i]= input.nextInt();
        }
        diff_value(array);
        

    }  
    public static void diff_value(int array[])
    {
        int array1[] = new int[array.length -1];
        for(int i=0;i<array.length-1;i++)
        {
            array1[i]=array[i+1]-array[i];
        }
        bubble_sort(array);
        
    
    }
    public static void bubble_sort(int array[])
    {
        int size = array.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("the smallest gap in the following array is :" + array[0]);

    }
}  

