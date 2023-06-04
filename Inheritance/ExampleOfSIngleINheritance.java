package Inheritance;

class Parent{
    void showParent(){
        System.out.println("hello i am parent...");
    }
}
class Child extends Parent{
    void Display(){
        System.out.println("Hello i am child.......");
    }
}
public class ExampleOfSIngleINheritance {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.showParent();
        c1.Display();
    }
}
