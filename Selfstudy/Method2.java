package Selfstudy;
import java.util.Scanner;
public class Method2 {
   public void display( String name ,int roll ,String address){
       System.out.println( name);
       System.out.println( roll);
       System.out.println( address);
   }
    public static void main(String args[]){

       Method2 m2=new Method2() ;
       m2.display("naresh",12 ,"ktm");

    }
}
