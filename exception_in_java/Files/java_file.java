package exception_in_java.Files;

import java.io.File;
import java.io.IOException;

public class java_file {
    public static void main(String[] args) {
        try {
            File obj1= new File("example.txt");
            if(obj1.createNewFile()){
                System.out.println("File created : " + obj1.getName());
            }
            else
            {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }
}
