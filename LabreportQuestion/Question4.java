package LabreportQuestion;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        char ch;
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        ch=sc.next().charAt(0);
        switch(ch){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u': i++;
        }
        if(i==1){
            System.out.println("vowel="+ch);
        }
        else if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("consonant="+ch);
        }
        else{
            System.out.println("error message");
        }
    }
}
