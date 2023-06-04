package constructor;
//ArrayList collection
import java.util.*;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\n");
        list.set(3,60);
        Iterator itr1=list.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
