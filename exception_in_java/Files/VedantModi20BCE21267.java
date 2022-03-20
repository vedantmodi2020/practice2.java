package exception_in_java.Files;

import java.io.File;
import java.io.FileReader;

//utf reading till the end
public class VedantModi20BCE21267 {
    public static void main(String[] args) {
        try {
            File file = new File("exapmle.txt");
            FileReader sat = new FileReader(file);
            int c;
            while ((c = sat.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
