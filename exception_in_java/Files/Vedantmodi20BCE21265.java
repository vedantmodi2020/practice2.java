package exception_in_java.Files;
//utf one byte read

import java.io.File;
import java.io.FileReader;

public class Vedantmodi20BCE21265 {
    public static void main(String[] args) {
        try
          {
            File file = new File("example.txt");
            FileReader sat = new FileReader(file);
            System.out.println((char)sat.read());
            sat.close();
          }
          catch(Exception e)
          {
          System.out.println("Exception handled here");
          }
    }
}
