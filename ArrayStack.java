import java.util.Scanner;
//operations on stack using array
//push,pop,peek,size,check full and empty,print the stack
public class ArrayStack {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StackMain ob = new StackMain(n);
         char ch;
        do {
            System.out.println("1 push");
            System.out.println("2 pop");
            System.out.println("3 peek");
            System.out.println("4 isEmpty");
            System.out.println("5 isFull");
            System.out.println("6 size");
            System.out.println("7 print");
            int c=s.nextInt();
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
                    System.out.println(ob.isFull());
                    break;
                case 6:
                    System.out.println(ob.countsize());
                    break;
                case 7:
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

    static class StackMain {

       public int a[],top,size;

        public StackMain(int n) {
            size = n;
            a = new int[size];
            top = -1;
        }

        public void push(int x) {
            if (top == size - 1) {
                System.out.println("Stack is full");
                return;
            }
            top++;
            a[top] = x;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return top;
            }
            int res = a[top];
            top--;
            return res;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return top;
            }
            return a[top];
        }

        public boolean isEmpty() {
            return top == -1;

        }

        public boolean isFull() {
            return top == size - 1;

        }

        public void print() {
            if (size == 0) {
                System.out.println("empty");
                return;
            }
            for (int i = top; i >=0 ; i--) {
                System.out.print(a[i]+ "   ");
            }
        }

        public int countsize() {
            return (top+1);
        }
    }
}

