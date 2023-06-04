package Exception;

public class Test {
    public static void main(String[] args) {
        try {
            int data = 23 / 0;

        } catch (Exception e) {
            System.out.println("23 is cannot divided by zero....");

        }
    }

}