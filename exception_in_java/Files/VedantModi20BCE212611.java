package exception_in_java.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class VedantModi20BCE212611 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileInputStream in = new FileInputStream(file);
            InputStreamReader fin = new InputStreamReader(in, "UTF-16");
            char c[] = new char[6];
            fin.read(c);
            for (char k : c) {
                System.out.println(k);
            }
            in.close();
            fin.close();
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
