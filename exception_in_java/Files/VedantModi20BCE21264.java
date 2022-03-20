package exception_in_java.Files;
//writing in file
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VedantModi20BCE21264 {
    public static void main(String[] args) throws IOException {
        File obj = new File ("20BCE2126.txt");
        FileOutputStream fout = new FileOutputStream(obj);
        byte b[]=new byte[5];
        b[0]=86;
        b[1]=101;
        b[2]=97;
        b[3]=110;
        b[4]=116;
        fout.write(b);
}
}
