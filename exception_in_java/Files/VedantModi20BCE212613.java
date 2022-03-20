package exception_in_java.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class VedantModi20BCE212613 {
    public static void main(String[] args) {
        try {
            File file = new File("20BCE2126.txt");
            FileOutputStream out = new FileOutputStream(file, true);
            OutputStreamWriter fout = new OutputStreamWriter(out, "UTF-16");
            char c[] = { 'δ', 'κ', 'λ' };
            fout.write(c);
            System.out.println("file writing successful");
            fout.close();
            out.close();
        } catch (Exception e) {
            System.out.println("Exception handled here");
        }
    }
}
