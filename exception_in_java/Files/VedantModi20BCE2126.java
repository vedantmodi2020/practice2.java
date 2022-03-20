package exception_in_java.Files;
// 1 byte code read
import java.util.*;
import java.io.*;
import java.sql.SQLException;
public class VedantModi20BCE2126{
public static void main(String[] args) throws Throwable{
File obj = new File("example.txt");
FileInputStream fin = new FileInputStream(obj);
int c=fin.read();
System.out.println(c);
}
}