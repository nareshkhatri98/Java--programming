package LabreportQuestion;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 number");
        num1= sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num4=sc.nextInt();
        num5=sc.nextInt();
        int sum=num1+num2+num3+num4+num5;
        double average=sum/5;
        System.out.println(sum);
        System.out.println(average);
    }
}
