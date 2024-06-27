import java.util.Stack;
public class StackPrac {
    public static void main(String[] args) {
        Stack s=new Stack();
        
        s.push(10);
        s.push("hello");
        s.push(10.5);
        s.push('s');

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(10.5));
        System.out.println(s.empty());

    }
}
