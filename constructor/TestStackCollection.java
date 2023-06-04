package constructor;
//Stack collection
import java.util.*;
public class TestStackCollection {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<String>();
        stack.push("Ayush");
        stack.push("Ram");
        stack.push("Ami");
        stack.push("Grima");
        Iterator<String>itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
