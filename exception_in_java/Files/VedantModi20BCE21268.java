package exception_in_java.Files;

import java.io.File;
import java.io.FileWriter;

public class VedantModi20BCE21268 {
    public static void main(String[] args) {
        try {
            File file = new File("20BCE2126.txt");
            FileWriter fout = new FileWriter(file);
            fout.write(1414);
            System.out.println("File write successful");
            fout.close();
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
