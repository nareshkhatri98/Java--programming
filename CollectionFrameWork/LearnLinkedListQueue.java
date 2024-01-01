package CollectionFrameWork;
// Queue is similar to stack but different is first in first out..

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public  static  void main(String [] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        // the offer function is used the insert the data in the queue.
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(1);
        queue.offer(7);

        System.out.println( queue );

        // poll() function is used to delete the items form the queue. and it returns the first inserted element.
        System.out.println("The remove item is " +queue.poll());
        System.out.println( queue );

        //peek() function is used to find out the next element of the queue.
        System.out.println("the next element is " +queue.peek());
        queue.poll();
        System.out.println(queue);

    }
}
