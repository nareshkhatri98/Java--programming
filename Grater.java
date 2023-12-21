import java.util.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.text.StyleConstants; 
public class Grater{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        
       System.out.println("enter the first number:");
       int Number1=sc.nextInt();
       System.out.println("Enter second number:");
       int Number2=sc.nextInt();
       System.out.println("enmter the third number:");
       int Number3=sc.nextInt();

      if(Number1>Number2 && Number1>Number3)
      {
          System.out.println(Number1);
      }
     else if(Number2>Number1 && Number2>Number3)
     {
         System.out.println(Number2);
     }
     else 
     {
         System.out.println(Number3);
     }
     

    }
}
    
