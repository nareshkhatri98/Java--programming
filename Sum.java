import java.util.*;
public class Sum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);// for input
        System.out.println("enter the first number:");
        int Num1=sc.nextInt();
        System.out.println("enter the second number:");
        int Num2=sc.nextInt();
         //we perform the arthmetic operation
        int multi=Num1*Num2;
        int Sum=Num1+Num2;
        int diff=Num1-Num2;
        int div=Num1/Num2;

        System.out.println(multi);
        System.out.println(Sum);
        System.out.println(diff);
        System.out.println(div);
    }
    
}
