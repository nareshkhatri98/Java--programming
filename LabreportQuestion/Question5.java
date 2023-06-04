package LabreportQuestion;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        int opt;
        do {
            double num1, num2, add, sub, mul, div;
            System.out.println("enter num1:");
            num1 = sc.nextDouble();
            System.out.println("enter num2");
            num2 = sc.nextDouble();
            add = num1 + num2;
            sub = num1 - num2;
            mul = num1 * num2;
            div = num1 * num2;
            System.out.println("1.for addition\n 2.for subtraction\n 3.for multiply\n.4.for divide");
            System.out.println("enter option:");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("addition=" + add);
                    break;
                case 2:
                    System.out.println("subtraction=" + sub);
                    break;
                case 3:
                    System.out.println("multiply=" + mul);
                    break;
                case 4:
                    System.out.println("divide=" + div);
                    break;
                default:
                    System.out.println("enter valid option");
            }
            System.out.println("do you want star again");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        }
    }
