package Mathclass.com;
  class A{
      public void show(){
          System.out.println("hello....");
      }
  }
  class B extends A{
    public   void show(){
        System.out.println("heyyyyy...........");
      }
  }
public class Methodoverriding {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
