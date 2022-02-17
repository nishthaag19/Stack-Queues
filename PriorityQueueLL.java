import java.util.Scanner;

//all operations on priority queue using linked list.
//insert,delete, check empty,count size,print the queue.

class PQNode{
    int data;
    int priority;  //used to determine the order in which data is  processed.
    PQNode next;

    public PQNode(int data,int priority) {
    this.data=data;
    this.priority=priority;
    }
 }

public class PriorityQueueLL {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        PQOperations ob=new PQOperations();
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
                    System.out.println("enter priority");
                    int y=s.nextInt();    // same priority on FCFS basis.
                    ob.Enqueue(new PQNode(x,y));
                    break;
                case 2:
                    ob.Dequeue();
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
class PQOperations{
    PQNode front,rear;

    public PQOperations() {
        front=rear=null;
    }

    void Enqueue(PQNode newnode) {
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            PQNode temp = front;
            while (temp.next!=null && temp.next.priority<=newnode.priority){
                temp=temp.next;

            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void Dequeue(){
        PQNode temp=front;
        System.out.println(temp.data);
        front=front.next;
    }

    boolean isEmpty(){
        return (front==null);
    }

    public int countsize(){
        int c=0;
        PQNode temp=front;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return (c);
    }

    public void print(){
        if(front==null){
            System.out.println("empty");
        }
        PQNode temp=front;
        while (temp!=null){
            System.out.print(temp.data + "  "+ temp.priority);
            System.out.println();
            temp=temp.next;
        }
    }

}