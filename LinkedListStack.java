import java.util.Scanner;
//operations on stack using linked list
//push, pop, peek, size of stack, check empty, print the stack.
class Node{
     int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackOperations ob = new StackOperations();
        char ch;
        do {
            System.out.println("1 push");
            System.out.println("2 pop");
            System.out.println("3 peek");
            System.out.println("4 isEmpty");
            System.out.println("5 size");
            System.out.println("6 print");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    int x = s.nextInt();
                    ob.push(x);
                    break;
                case 2:
                    System.out.println(ob.pop());
                    break;
                case 3:
                    System.out.println(ob.peek());
                    break;
                case 4:
                    System.out.println(ob.isEmpty());
                    break;
                case 5:
                    System.out.println(ob.countsize());
                    break;
                case 6:
                    ob.print();
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
            System.out.println("to continue press c");
            ch = s.next().charAt(0);
        } while (ch == 'c');
    }
}
class StackOperations{
    public Node head;
    public int size;

    public StackOperations(){
        head=null;
        size=0;
    }

    public void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }

    public  int pop(){
        if(head==null){return Integer.MAX_VALUE;}
        int res=head.data;

        head=head.next;
        size--;
        return res;
    }

    public  int peek(){
        if(head==null){return Integer.MAX_VALUE;}
        return head.data;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int countsize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }
}

