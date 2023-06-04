package Main;
import java.util.Scanner;
import Encplu.*;
import Interf.*;
import Imple.*;
public class StdMAinTest {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter a num1:");
        int num1=sc.nextInt();
        System.out.println("enter a num2");
        int num2=sc.nextInt();
        StdEncp EE=new StdEncp();
        EE.setA(num1);
        EE.setB(num2);
        StdInterf obj=new StdImple() ;
        obj.add(EE);
        System.out.println("subtract="+obj.subb(EE));
    }
}
