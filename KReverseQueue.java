import java.util.Deque;
import java.util.Scanner;

// to reverse first k elements in the queue.
public class KReverseQueue {
    Node top,front,rear;
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
    public void push(int x){
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
    }

    public  int pop(){
        if(top==null){return Integer.MAX_VALUE;}
        int res=top.data;

        top=top.next;
        return res;
    }
   public void print(int k){
        Node curr=front;
       for (int i = 0; i < k; i++) {
           push(curr.data);
           curr=curr.next;
       }
       for (int i = 0; i < k; i++) {
           System.out.println(pop());
           Dequeue();
       }
       Node temp= front;
       while(temp!=null)
       {
           System.out.println(temp.data);
           temp=temp.next;
       }
   }
    public static void main(String[] args) {
        KReverseQueue ob= new KReverseQueue();
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int k=s.nextInt();
        for (int i = 0; i < n; i++) {
            ob.Enqueue(s.nextInt());

        }
        ob.print(k);
    }
}
