package exception_in_java.Files;
//till the end byte read code
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VedantModi20BCE21261 {
    public static void main(String[] args) throws IOException {
        File obj = new File("example.txt");
        FileInputStream fin = new FileInputStream(obj);
        int data;
        while((data=fin.read())!=-1)
        {
            System.out.println(data);
        }
    }
}
