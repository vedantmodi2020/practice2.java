package exception_in_java.Files;
//reading input in from of the array
import java.io.File;
import java.io.FileInputStream;

public class VedantModi20BCE21263 {
        
            public static void main(String[] args) throws Throwable{
            File obj = new File("exapmle.txt");
            FileInputStream fin = new FileInputStream(obj);
            byte a[]=new byte[6];
            fin.read(a);
            for(byte b:a)
            {
            System.out.println(b);
            }
            }
            
    }

