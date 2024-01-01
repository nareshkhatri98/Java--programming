package CollectionFrameWork;

import java.util.Stack;

// stack means first in last out and last in first out.
public class LearnStack {
    public static  void main(String[] args)
    {
        Stack<String> Animals  = new Stack<>();
        // the push function is use to insert the elements into the stacks.
        Animals.push("Lion");
        Animals.push("Cat");
        Animals.push("Elephant");
        Animals.push("Goat");

        System.out.println("the elements on stacks are " +Animals);

        // peek() function is used to show the last inserted element.
        System.out.println(Animals.peek()); // this will return the Goat.

        // pop() is used to delete the item from the stack.
         Animals.pop();// it removes the Goat from the  stack.
        System.out.println(Animals.peek());
        System.out.println("Stack elements are " +Animals);
        for (String Elements: Animals) {
            System.out.println("the elements are " +Elements);
        }

    }
}
