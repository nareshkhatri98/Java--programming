package LabreportQuestion;
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class Question9 {
    public static void main(String[] args) {
        Adder ad=new Adder();
        System.out.println(ad.add(11,13));
        System.out.println(ad.add(1,2,3));
    }
}

