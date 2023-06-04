package Exception;

public class TestThrow1 {
    public static void Validate(int age){
        if(age<18){
            throw new ArithmeticException("person can not eligible to vote... ");
        }
        else{
            System.out.println("person is eligible to vote...");
        }
    }

    public static void main(String[] args) {
        Validate(14);
        System.out.println("rest of  the code...");
    }

}
