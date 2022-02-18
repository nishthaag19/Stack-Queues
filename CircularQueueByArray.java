import java.util.Scanner;

//all operations on circular queue by array.

public class CircularQueueByArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of queue");
        int size= s.nextInt();
        CQOperations ob = new CQOperations(size);
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
                    ob.enqueue(x);
                    break;
                case 2:
                    ob.dequeue();
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
  class CQOperations{
    int a[],size,front,rear;

      public CQOperations(int size) {
          this.size = size;
          a=new int[size];
          front=rear=-1;
      }

      public boolean isEmpty(){
          return(rear==-1);
  }
  
  public boolean isFull(){
          if(rear+1==front)
              return true;
          else
              return (front == 0) && (rear + 1 == size);
  }

  public void enqueue(int data){
          if(isFull())
              System.out.println("overflow");
          else if(isEmpty())
          {
              front=0;
              rear++;
              a[front]=data;
              }
          else{
              if(rear+1==size)
                  rear=0;
              else
                  rear++;
              a[rear]=data;

          }
  }

  public void dequeue(){
          if(isEmpty())
              System.out.println("empty");
          else{
              System.out.println(a[front]);
              if(front==rear)
                  front=rear=-1;
              else if(front+1==size)
                  front=0;
              else
                  front++;

          }
  }

  public int countsize(){
          int c=0;
          for (int i = front; i <= rear; i++) {
              c++;
          }
          return c;
      }

      public void printQueue() {
          if (rear >= front) {
              for (int i = front; i <= rear; i++) {
                  System.out.print(a[i] + "  ");
              }
          } else {
              for (int i = front; i < size; i++) {
                  System.out.println(a[i] + "   ");
              }
              for (int i = 0; i <=rear ; i++) {
                  System.out.println(a[i] +"   ");
              }
          }
      }
}


