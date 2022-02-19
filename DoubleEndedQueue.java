import java.util.Scanner;

//Double Ended Queue.

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of queue");
        int size= s.nextInt();
        DEQOperations ob=new DEQOperations(size);
        char ch;
        do {
            System.out.println("1 insert front");
            System.out.println("2 insert rear");
            System.out.println("3 remove front");
            System.out.println("4 remove rear");
            System.out.println("5 isEmpty");
            System.out.println("6 isFull front");
            System.out.println("7 isFull rear");
            System.out.println("8 print");
            int c=s.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter value");
                    int x = s.nextInt();
                    ob.insertFront(x);
                    break;
                case 2:
                    System.out.println("enter value");
                    int y = s.nextInt();
                    ob.insertRear(y);
                    break;
                case 3:
                    ob.deleteFront();
                    break;
                case 4:
                    ob.deleteRear();
                    break;
                case 5:
                    System.out.println(ob.isEmpty());
                    break;
                case 6:
                    System.out.println(ob.isFullFront());
                    break;
                case 7:
                    System.out.println(ob.isFullRear());
                    break;
                case 8:
                    ob.print();
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

class DEQOperations {
    int front,size;
    int rear;
    int arr[];

    public DEQOperations(int size){
        arr=new int[size];
        front=rear=-1;
    }

public boolean isEmpty() {
    return (front == -1 && rear == -1);
}

public boolean isFullFront(){
    return (front==0);
}

public boolean isFullRear() {
    return (rear == size - 1);
}

    public void insertFront(int value){
        if(isFullFront())
            System.out.println("full");

        else if(front==-1&&rear==-1){
            front=rear=0;
            arr[front]=value;
        }
        else {
                front--;
                arr[front] = value;
             }
        }

    public void insertRear(int value){
        if(isFullRear())
            System.out.println("full");
        else{
            if(front==-1&&rear==-1){
                front=rear=0;
                rear++;
            }
            else{
                rear++;
                arr[rear]=value;
            }
        }
    }

    public void deleteFront(){
        if(isEmpty())
            System.out.println("empty");
        else if(front==rear){
            System.out.println(arr[front]);
            front=rear=-1;
        }
        else{
            System.out.println(arr[front]);
            front++;
        }
    }

    public void deleteRear(){
        if(isEmpty())
            System.out.println("empty");
        else if(front==rear) {
            System.out.println(arr[rear]);
            front=rear=-1;
        }
        else{
            System.out.println(arr[rear]);
            rear--;
        }
    }
    public void print(){
        for (int i = front; i <=rear; i++) {
            System.out.println(arr[i]+ "    ");
        }
    }
}