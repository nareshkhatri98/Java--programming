package Labreport;
import java.util.Scanner;
public class Multiplication {//7
    public static void main(String args[]){
        int num;
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number:");
        num=scan.nextInt();
        for(i=1;i<=10;i++) {
            System.out.println(num+" * " +i+"=" +num*i);
        }
    }
}
