package Labreport;
import java.util.Scanner;//4
public class VowelorConsonant {
    public static void main(String args[]){
        char ch;
        int i=0;
        Scanner scan=new Scanner(System .in);
        System.out.println("enter the character:");
        ch=scan.next().charAt(0);
        switch(ch){
            case'A':
            case'a':
            case'E':
            case'e':
            case 'i':
            case'I':
            case 'o':
            case 'O':
            case'u':
            case'U': i++;
        }
        if (i==1){
            System.out.println("the character is vowel="+ch);
        }
        else if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("the character is consonant="+ch);
        }
        else {
            System.out.println("error massage");
        }
    }
}
