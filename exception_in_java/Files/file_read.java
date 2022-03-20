package exception_in_java.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_read {
    public static void main(String[] args) {
        try {
            File obj = new File("exapmle.txt");
            Scanner input = new Scanner(obj);
            while(input.hasNextLine()){
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found in the system");
            e.printStackTrace();
        }
    }
}
//to delete the file we use filename.delete()
