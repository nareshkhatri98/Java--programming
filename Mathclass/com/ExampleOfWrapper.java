package Mathclass.com;
 //autoboxing (primitive into wrappers class)
public class ExampleOfWrapper {
    public static void main(String[] args){

        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(a+" "+i+" "+j);

        Integer b=new Integer(3);
        Integer y=b.intValue();
        Integer z=b;
        System.out.println(b+" "+y+" "+z);
    }
}
