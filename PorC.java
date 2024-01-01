package Labreport;
import java.util.Scanner;
//2

public class PorC {
    public static void main(String args[]){
        int num;
        Scanner p1=new Scanner(System.in);
        System.out.println("Enter a number");
        num= p1.nextInt();
        Display(num);
    }
      public static void Display(int num){
        int count=0,i;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count==2)
        {
            System.out.println("prime="+num);
        }
        else if (count==1)
        {
            System.out.println("not prime not composite="+num);
        }
        else {
            System.out.println("composite="+num);
        }



    }
}
