package Stringpractice;
// String Buffer in java
// 1)append
// 2)insert
//3)delete
// 4)reverse
import java.util.*;
public class AppendExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("java");
        StringBuffer Sb1=new StringBuffer("Rajesh");
        Sb1.insert(1,"Naresh");
        System.out.println(sb);
        System.out.println(Sb1);
        StringBuffer sb2=new StringBuffer("Upendra");
        sb2.delete(1,3);
        System.out.println(sb2);
        StringBuffer sb3=new StringBuffer("System design");
        sb3.reverse();
        System.out.println(sb3);
    }
}
