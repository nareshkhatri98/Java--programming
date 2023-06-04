package Inheritance;
//multilevel inheritance.
class A {
    void showA() {
        System.out.println("hey bca third");
    }
}
    class B extends A {
        void ShowB() {
            System.out.println("Hello BCA 3rd");
        }
    }
        class c extends B{
           void showC(){
               System.out.println("Hello");

            }
        }
public class Test {
    public static void main(String args[])
    {
        c a=new c();
        a.showA();
        a.ShowB();
        a.showC();

    }
}
