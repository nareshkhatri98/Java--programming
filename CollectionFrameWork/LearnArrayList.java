package CollectionFrameWork;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import  java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        /*
        ArrayList<String> StudentName = new ArrayList<>();
        StudentName.add("Ram");
        StudentName.add("hari");
        StudentName.add("Gita");
        StudentName.add("Naresh");
        StudentName.add(2,"ABCD");
        System.out.println(StudentName);
        StudentName.add(2,"Upendra");
        System.out.println(StudentName);
        System.out.println(StudentName.contains("abcd"));
        System.out.println(StudentName.get(4));

         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

        List<Integer>newList = new ArrayList<>();
        newList.add(12);
        newList.add(90);
        newList.add(100);

        list.addAll(newList);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
