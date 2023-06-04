package implementationofStack;

public class Stackclass {
    static  class Node{
        int data;
      Node link;
      public Node(int data){
          this.data=data;
          link=null;
      }
    }
    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node Newnode = new Node(data);
            if (isEmpty()) {
                head = Newnode;
                return;
            }
            Newnode.link = head;
            head = Newnode;
        }


        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(4);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
