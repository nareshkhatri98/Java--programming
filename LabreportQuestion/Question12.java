package LabreportQuestion;
import java.util.Scanner;
class Addition
{
    int a, b;
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public  void setA( int a)
    {
        this.a=a;
    }
    public void setB(int b)
    {
        this.b=b;
    }
}

public class Question12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Addition A=new Addition();
        System.out.println("enter a");
        A.setA(sc.nextInt());
        System.out.println("enter b");
        A.setB(sc.nextInt());
        int add=A.getA()+A.getB();
        int sub=A.getA()-A.getB();
        System.out.println(add);
        System.out.println(sub);
    }
}

