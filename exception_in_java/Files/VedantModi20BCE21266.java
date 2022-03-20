package exception_in_java.Files;
//utf reading in array
import java.io.File;
import java.io.FileReader;

public class VedantModi20BCE21266 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader sat = new FileReader(file);
            char c[] = new char[6];
            sat.read(c);
            for (char k : c) {
                System.out.println(k);
            }
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
