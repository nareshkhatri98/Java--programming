package Interface;
import java .util.Scanner;
interface ArithmeticOperation{
    void input();
    void output();
    void Operation();
}
class Calculate implements ArithmeticOperation{
    int num1,num2,add,sub,mul;
    double div;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        num1=sc.nextInt();
        System.out.println("Enter num2");
        num2=sc.nextInt();
    }
   public  void Operation()
    {
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
    }
    public void output() {
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}

public class InterfaceDemo2 {
    public static void main(String args[]){
        ArithmeticOperation Ao=new Calculate();
        Ao.input();
        Ao.Operation();
        Ao.output();
    }
}
