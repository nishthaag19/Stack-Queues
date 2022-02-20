import java.util.Scanner;
//to reverse a stack using another empty stack.
public class ReverseStack {
    int arr[];
    int top;

    ReverseStack(int n){
        top=-1;
        arr=new int[n];
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ReverseStack s1=new ReverseStack(n);
        ReverseStack s2=new ReverseStack(n);
        for (int i = 0; i < n; i++) {
            s1.push(s.nextInt());
        }
        s1.print();
        System.out.println("after reversal");
        for (int i = 0; i <n ; i++) {
            s2.push(s1.arr[n-i-1]);
        }
        s2.print();
    }

    public void push(int value){
            top++;
            arr[top]=value;
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ "    "+ arr[i]);
        }
    }
}