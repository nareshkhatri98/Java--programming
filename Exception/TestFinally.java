package Exception;

public class TestFinally {
    public static void main(String[] args) {

        try

    {
        String str=null;
        System.out.println(str.length());

    }catch(Exception e) {
            System.out.println(e);

    }finally{
            System.out.println("love you");
        }
        System.out.println("rest of the code........");
}
}
