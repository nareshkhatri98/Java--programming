package constructor;
// example of parameterized constructor.
public class Simple {
    int length;
    int breadth;
    Simple(int l, int b)
    {
        System.out.println("Detail of rectangle");
        length=l;
        breadth=b;

    }
    int Area()
    {
        return length*breadth;
    }
    public static void main(String args[])
    {
        Simple S=new Simple(12,2);
         int A=S.Area();
        System.out.println("Area="+A);

    }
}
