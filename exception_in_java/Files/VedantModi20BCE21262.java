package exception_in_java.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.FieldPosition;

//converting int to character
public class VedantModi20BCE21262 {
    public static void main(String[] args) throws IOException {
        File obj = new File("example.txt");
        FileInputStream fin = new FileInputStream(obj);
        int data;
        while((data = fin.read())!=-1)
        {
            System.out.println((char)data);
        }
    }
}
