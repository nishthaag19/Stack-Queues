import java.util.*;
//to remove consecutive duplicates from the string using stack
public class ConsDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(remove(str));
    }
    static String remove(String str){

    Stack<Character> stack= new Stack<>();
    String string="";
    string+=str.charAt(0);
    stack.push(str.charAt(0));

    for(int i=1;i<str.length();i++){
        if(stack.peek()!=str.charAt(i)){
            string=string+str.charAt(i);
        }
        stack.push(str.charAt(i));
        }
        return string;
   }
}
