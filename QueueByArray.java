import java.util.Scanner;
//all operations on queue by using array.
//enqueue, dequeue , check empty , check full, count size,print the queue.
public class QueueByArray {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of queue");
        int size= s.nextInt();
        QOperations ob = new QOperations(size);
        char ch;
        do {
            System.out.println("1 Enqueue");
            System.out.println("2 Dequeue");
            System.out.println("3 isEmpty");
            System.out.println("4 isFull");
            System.out.println("5 size");
            System.out.println("6 print");
            int c=s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter value");
                    int x = s.nextInt();
                    ob.Enqueue(x);
                    break;
                case 2:
                    System.out.println(ob.Dequeue());
                    System.out.println("element removed");
                    break;
                case 3:
                    System.out.println(ob.isEmpty());
                    break;
                case 4:
                    System.out.println(ob.isFull());
                    break;
                case 5:
                    System.out.println(ob.countsize());
                    break;
                case 6:
                    ob.printQueue();
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
            System.out.println("to continue press c");
            ch=s.next().charAt(0);
        } while (ch=='c');
    }
}
class QOperations{
      int array[];
      int front,rear,size;

    QOperations(int size){
        this.size=size;
        front =rear=0;
        array = new int[size];
    }
    public int  Enqueue(int value){
        if(size==rear) {
            System.out.println("overflow");
        } else {
            array[rear] = value;
            rear++;
        }
      return front;
    }

    public  int Dequeue(){
        if(isEmpty()) {
            System.out.println("underflow");
        }else{
                array[front]=0;    //0 means it is deleted
                front++;
        }
        return front ;
    }
    public void printQueue()
    {
        if (front == rear) {
            System.out.println("underflow");
        }
        for (int i = front; i < rear; i++) {
            System.out.print(array[i] + "  ");
        }
    }
   public boolean isEmpty(){
        return (front==-1);
   }
   public  boolean isFull(){
        return (rear==size-1);  //or array.length-1
   }
   public int countsize(){
        return (rear);
   }
}
