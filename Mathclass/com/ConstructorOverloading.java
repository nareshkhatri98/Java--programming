package Mathclass.com;
  class Test{
      Test(int x, int y){
        int c=x+y;
          System.out.println(c);
      }
      Test(int x, int y, int z){
          int a=x*y*z;
          System.out.println(a);

      }
      Test(){
          System.out.println("this is default constructor....");
      }
  }

public class ConstructorOverloading {
    public static void main(String[] args) {
        Test t=new Test(12,13);
        Test T=new Test(13,1,2);
        Test T1=new Test();

    }
}
