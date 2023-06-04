package LabreportQuestion;

public class Question31 {
    public static void main(String[] args){
        int num[]={55,52,1,79};
        int smallest=num[0];
        int largest=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>largest)
            {
                largest=num[i];
            }
            else if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Largest:"+largest);
        System.out.println("Smallest:"+smallest);
    }
}
