package Labreport;
import java.util.Scanner;//5
public class Calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char ch;
        int opt;
        do {
            double num1, num2, add, sub, mul, div;
            System.out.println("enter num1");
            num1 = scan.nextDouble();
            System.out.println("enter num2");
            num2 = scan.nextDouble();
            add = num1 + num2;
            sub = num1 - num2;
            div = num1 / num2;
            mul = num1 * num2;
            System.out.println("1.for addition\n 2.for subtraction\n 3.for division\n 4.for multiply");
            System.out.println("enter the option");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("addition=" + add);
                    break;
                case 2:
                    System.out.println("subtraction=" + sub);
                    break;
                case 3:
                    System.out.println("divide=" + div);
                    break;
                case 4:
                    System.out.println("multiply=" + mul);
                    break;
                default:
                    System.out.println("enter valid option");
            }
                System.out.println("dou you want rre-run the program y/n");
                ch = scan.next().charAt(0);

        }while(ch=='y'|| ch== 'Y');
    }
}
