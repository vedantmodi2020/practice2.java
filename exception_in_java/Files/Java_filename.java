package exception_in_java.Files;

import java.io.File;

public class Java_filename {
    public static void main(String[] args) {
        File f1 = new File("javaLabExercise.txt");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());;
        if(f1.canRead())
        {
            System.out.println("File reading is allowed");
        }
        if(f1.canWrite())
        {
            System.out.println("File Writing is allowed");
        }
        File rename = new File("Newname.txt");
        f1.renameTo(rename);
        
    }
}
