import java.util.Scanner;
// all operations on queue using linked list.
// enqueue , dequeue, count size, check empty, print the queue.

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class QueueByLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QLLOperations ob=new QLLOperations();
        char ch;
        do {
            System.out.println("1 enqueue");
            System.out.println("2 dequeue");
            System.out.println("3 isEmpty");
            System.out.println("4 size");
            System.out.println("5 print");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter value");
                    int x = s.nextInt();
                    ob.Enqueue(x);
                    break;
                case 2:
                    System.out.println(ob.Dequeue());
                    break;
                case 3:
                    System.out.println(ob.isEmpty());
                    break;
                case 4:
                    System.out.println(ob.countsize());
                    break;
                case 5:
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
class QLLOperations{
    Node front ,rear;
    public QLLOperations(){
        front =rear=null;
    }

    public void Enqueue(int data){
        Node temp = new Node(data);
        if(front==null && rear==null) {
            front = rear = temp;
        }else{
            rear.next=temp;
            rear=rear.next;
        }
    }

    public int Dequeue(){
        int res=front.data;
        if(front==null)
            System.out.println("underflow");
        else {
            front = front.next;
        }
        return res;
    }

    public boolean isEmpty(){
        return (front==null);
    }

    public void print(){
        if(front==null){
            System.out.println("empty");
        }
        Node temp=front;
        while (temp!=null){
            System.out.print(temp.data + "  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int countsize(){
        int c=0;
        Node temp=front;
        while(temp!=null){
            c++;
            temp=temp.next;

        }
        return (c);
    }
}