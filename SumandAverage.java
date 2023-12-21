package Labreport;
import java.util.Scanner;//8
public class SumandAverage {
    public static void main(String args[]){
        int num1,num2,num3,num4,num5,sum;
        double Average;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the  five  number:");
        num1=scan.nextInt();
        num2= scan.nextInt();
        num3 =scan.nextInt();
        num4=scan.nextInt();
        num5=scan.nextInt();
        sum=num1+num2+num3+num4+num5;
        Average=sum/5;
        System.out.println(Average);
        System.out.println(sum);
    }
}
