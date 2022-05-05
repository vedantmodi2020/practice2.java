package exception_in_java.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.crypto.SecretKey;

public class cars {
    public static void main(String[] args) {
        try {
            car[] c = new car[4];
            c[0]= new car("Seltos", "kia");
            c[1]= new car("A5", "Audi");
            c[2]= new car("Mclaren C40", "Mclaren");
            c[3]= new car("carnival", "kia");
            FileOutputStream fou = new FileOutputStream("Cars.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fou);
            for(car k:c)
            {
                obj.writeObject(k);
            }
            obj.flush();
            obj.close();
            System.out.println("File write succesfull");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Cars.txt"));

            for(int i=0;i<4;i++)
            {
                car k= (car) in.readObject();
                if(k.Brandname.equals("kia"))
                {
                    System.out.println("Model Name: " + k.Modelname + " Brand Name: " + k.Brandname);
                }
                
            }
            in.close();

        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}

class car implements Serializable
{
    String Modelname;
    String Brandname;

    public car(String Modelname, String Brandname) {
        this.Modelname = Modelname;
        this.Brandname = Brandname;
    }

}
