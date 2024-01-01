package Labreport;
 import java. util.Scanner;//3
public class Divided {
    public static void main(String args[]){
         int num;
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
         num=scan.nextInt();
         if(num%3==0 && num%7==0 )
         {
             System.out.println("divided by 3  and 7");
         }
         else if(num%7==0) {
             System.out.println(" divided by 7");
         }
         else if (num%3==0)
         {
             System.out.println(" divided by 3");
         }
         else {
             System.out.println("not divided by  3 or7");
         }
    }
}
