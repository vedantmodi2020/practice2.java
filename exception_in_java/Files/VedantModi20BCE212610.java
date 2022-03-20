package exception_in_java.Files;
//utf-16 reading
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class VedantModi20BCE212610 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileInputStream in = new FileInputStream(file);
            InputStreamReader fin = new InputStreamReader(in, "UTF-16");
            System.out.println((char) fin.read());
            in.close();
            fin.close();
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
