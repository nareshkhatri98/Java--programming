package constructor;

public class Addition {
    private int num1;
    private int num2;
    Addition(int a, int b)
    {
        num1=a;
        num2= b;
    }
    int Sum()
    {
        return num1+num2;
    }
    public static void main(String args[])
    {
        Addition A=new Addition(12 ,13);
        System.out.println("sum="+A.Sum());
    }
}
