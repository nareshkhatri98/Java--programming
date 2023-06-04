package constructor;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>  set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements:" +set);
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method" +set);
        HashSet<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set1.addAll(set1);
        System.out.println("Updated list:" +set);
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method" +set);
        set.removeIf(str-> set.contains("Vijay"));
        System.out.println("After invoking removeIf()method" +set);
        set.clear();
        System.out.println("After invoking clear() method" +set);
    }
}
