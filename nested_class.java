public class nested_class {
   public static void main(String[] args) {
       outer obj1  = new outer();
       outer.nested obj2 = obj1.new nested();
       obj2.Display();
       
       
   } 
}

class outer
{
    public String a1;
    protected String a2;
    private String a3;
    public static int count =1;
    public outer() {
        a1 = "test1";
        a2 ="test2";
        a3 = "test3";
    }
    public class nested {//this is also know as an inner class
        public void Display()
        {
            System.out.println(a1 + a2 + a3 + count);
        }
    }  
}