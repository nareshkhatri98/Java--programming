package Selfstudy;
/* A constructor is a block of code which is similar to the methods.It is used when creates the instance object
of the class. It is specific method which is used to create the object of the main class.
Below the rules for constructor
1) constructor name should be main class.
2) constructor should not explict no return type.
3) constructor can not have static,abstract,synchronized keywords.
 */
public class ExampleOfConstructor {
    private int a=12;
    private int b=12;
    ExampleOfConstructor() {
        int c=a+b;
        System.out.println("The sum of two number is="+c);
    }
    public static void main(String[] args){
        ExampleOfConstructor c1=new ExampleOfConstructor();
    }
}
