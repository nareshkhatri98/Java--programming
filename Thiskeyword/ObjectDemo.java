package Thiskeyword;
class
Calculate{
    int num1,num2;
    int result;
    public Calculate(int num1 , int num2) {
      this.  num1= num1;
       this. num2=num2;
        result = num1 + num2;
       // System.out.println( "result="+result);
    }


}
public class ObjectDemo {
    public static void main(String  args[])
    {
        Calculate obj=new Calculate(3,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println( "Result="+obj.result);
    }
}


