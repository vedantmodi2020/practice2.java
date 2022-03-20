package exception_in_java.Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class file_write {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter write = new FileWriter("exapml1e.txt");
            write.write("This is an example file created in java using file handling");
            write.close();
            System.out.println("Succesfully edited the file");
        } catch (FileNotFoundException e) {
            System.out.println("File is not present");
            e.printStackTrace();
        }
        
    }
}
