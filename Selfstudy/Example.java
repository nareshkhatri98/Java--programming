package Selfstudy;
import java.util.Scanner;
public class Example {
    int roll;
    String name;
    Example( int roll ,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void show(){
        System.out.println(roll);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Example E= new Example(1,"BIsham");
        E.show();
    }
}
