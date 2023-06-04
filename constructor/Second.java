package constructor;
//example 2 of default constructor.
public class Second {
    int roll;

    String name;
    Second()
    {
        System.out.println(roll+" "+name);
    }
    public static void main(String args[])
    {
        Second S=new Second();
    }
}
