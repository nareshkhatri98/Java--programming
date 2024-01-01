package Labreport;
import java.util.Scanner;
public class MarkSheet {
    public static void main(String args[]) {
        float marks1, marks2, marks3, marks4, marks5, roll, totalmarks, percentage;
        String name, address;


        System.out.println("enter name:");
        Scanner n1 = new Scanner(System.in);
        name = n1.nextLine();
        System.out.println("enter address:");
        Scanner a1 = new Scanner(System.in);
        address = a1.nextLine();

        System.out.println("enter roll:");
        Scanner r1 = new Scanner(System.in);
        roll = r1.nextInt();

        System.out.println("enter marks of Science:");
        Scanner m1 = new Scanner(System.in);
        marks1 = m1.nextFloat();

        System.out.println("enter marks of maths:");
        Scanner m2 = new Scanner(System.in);
        marks2 = m2.nextFloat();

        System.out.println("enter marks of Nepali:");
        Scanner m3 = new Scanner(System.in);
        marks3 = m3.nextFloat();

        System.out.println("enter marks of English:");
        Scanner m4 = new Scanner(System.in);
        marks4 = m4.nextFloat();

        System.out.println("enter marks of Computer:");
        Scanner m5 = new Scanner(System.in);
        marks5 = m5.nextFloat();

        System.out.println("name=" + name);
        System.out.println("address=" + address);
        System.out.println("roll=" + roll);

        totalmarks = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("totalMarks=" + totalmarks);

        percentage = (float) totalmarks / 500 * 100;
        System.out.println("percentage=" + percentage);

        if (percentage >= 80 && percentage <= 100) {
            System.out.println("distinction");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("First Division");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("second Division");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Third Division");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Just pass");

        } else {
            System.out.println("fail");
        }
    }
}