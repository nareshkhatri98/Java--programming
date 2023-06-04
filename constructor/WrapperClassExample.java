package constructor;

public class WrapperClassExample {
    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(a+" "+i+" "+j);
    }
}
