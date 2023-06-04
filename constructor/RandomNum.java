package constructor;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.*;
public class RandomNum {
    public static void main(String[] args) {
        Random R=new Random();
        int random_int1=R.nextInt(1000);
        System.out.println("Random number is:"+random_int1);
        System.out.println("random number is:"+Math.random());
        int random_int= ThreadLocalRandom.current().nextInt();
        System.out.println("random number is:"+random_int);

    }
}
