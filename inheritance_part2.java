public class inheritance_part2 {
    public static void main(String[] args) {
        student12 v = new student12();
        v.display_student();
    }
}
class person1
{
    String name;
    String address;

    public person1() {
        //System.out.println("This is from the person class constructor");
        name ="test";
    }


    public person1(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public void display_person()
    {
        System.out.println("This is a display person");
    }
}

class student12 extends person1
{
    public String regno ;

    public student12() {
        //System.out.println("This is from the student class constructor");
        name = "test";
    }
    
    public student12(String name, String address ,String regno) {
        super(name, address);//should be the first statement
        this.regno = regno;
    }
    //overridding
    public void display_person()
    {
        System.out.println("new display function");
    }

    public void display_student()
    {
        System.out.println(regno);
        System.out.println(super.name);
    }
}
