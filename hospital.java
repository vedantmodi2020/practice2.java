import java.util.Scanner;
//vedant modi 20BCE2126
public class hospital {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please neter the total number of the paitents : ");
        num = input.nextInt();
        paitent[] array = new paitent[num];
        for(int i=0;i<num;i++)
        {
            array[i] = new paitent();
            array[i].setpaitent_details();
        }
        int flag=0;
        int choice;
        int id;
        String disease;
        do{
            System.out.println("Menu:-");
            System.out.println("1. Paitent Detail");
            System.out.println("2. List All paitents detail");
            System.out.println("3. Paitent with certain disease");
            System.out.println("4. Delete paitent record");
            System.out.println("5. Sort paitent list");
            System.out.println("6. Exit\n");
            System.out.println("Please Enter the choice : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Please enter the Paitent id");
                id = input.nextInt();
                searchid(id, array);
                    break;
                case 2:
                System.out.println("The list of All the paitent in the hospital currently is : ");
                for(int i=0;i<num;i++)
                {
                    if(array[i].flag1==0)
                    {
                        array[i].getpaitent_details();
                    }
                }
                break;
                case 3:
                System.out.println("Enter the paiten ID you wnt to delete : ");
                id = input.nextInt();
                delete(id, array);
                break;

                case 4:
                System.out.println("Enter the Disease Name : ");
                disease = input.nextLine();
                break;

                case 5:
                idsort(array);
                break;

                case 6:
                flag=1;
                break;

                default:
                    break;
            }
        }while(flag==0);
    }
    public static void idsort(paitent[] array) {
        paitent temp = new paitent();
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i;j++)
            {
                if(array[j].paitentid>array[j+1].paitentid)
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array[j];
                }
            }
        }
    }
    public static void diseasecon(String d , paitent[] array){
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].disease.equals(d))
            {
                array[i].getpaitent_details();
                count++;
            }
        }
        if(count ==0)
        {
            System.out.println("There is no person With the given Disease int the hospital");
        }
    }
    public static void delete(int id , paitent[] array) {
        int flag=1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].paitentid == id && array[i].flag1==0)
            {
                array[i].flagset();
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("There is no paitent with the given id");
        }
    }
    public static void searchid(int id, paitent[] array) {
        int flag=1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].paitentid == id && array[i].flag1==0)
            {
                array[i].getpaitent_details();
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("There is no paitent with the given id");
        }
    }
    
}
class paitent{
    String name;
    String Address;
    String Phoneno ;
    String dob;
    int paitentid ;
    public static int count =0;
    String disease;
    int flag1=0;
    public void setpaitent_details(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Address : ");
        Address = input.nextLine();
        System.out.println("Enter Phone NO. : ");
        Phoneno = input.nextLine();
        System.out.println("Enter D.O.B : ");
        dob = input.nextLine();
        paitentid = count++;
        System.out.println("Enter Disease Name : ");
        disease = input.nextLine();
    }
    public void getpaitent_details() {
        System.out.println("Name : " + name);
        System.out.println("Address : "  + Address );
        System.out.println("Phone No. : " + Phoneno);
        System.out.println("D.O.B : " + dob);
        System.out.println("Disease Name : " + disease);
    }
    public void editpaitent_details(){
        System.out.println("Please Re-enter all the details ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        System.out.println("Enter Address : ");
        Address = input.nextLine();
        System.out.println("Enter Phone NO. : ");
        Phoneno = input.nextLine();
        System.out.println("Enter D.O.B : ");
        dob = input.nextLine();
        paitentid = count++;
        System.out.println("Enter Disease Name : ");
        disease = input.nextLine();
    }
    public void flagset() {
        flag1=1;
    }
}