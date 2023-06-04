package LabreportQuestion;
import java.util.Scanner;
class Calc{
    private int num1,num2;
    public void setNum1(int num1)
    {
        this.num1=num1;
    }
    public  void setNum2(int num2)
    {
        this.num2=num2;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
}
public class Question13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calc C=new Calc();
        System.out.println("enter two numbers");
        C.setNum1(sc.nextInt());
        C.setNum2(sc.nextInt());
        int add=C.getNum1()+C.getNum2();
        int sub=C.getNum1()-C.getNum2();
        System.out.println(add);
        System.out.println(sub);

    }
}
