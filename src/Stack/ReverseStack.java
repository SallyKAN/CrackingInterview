package Stack;

import java.util.Stack;

public class ReverseStack {
    private static Stack<Integer> stack;
    public ReverseStack(){
        stack = new Stack<>();
    }
    public static void insertAtBottom(int value){
        if (stack.isEmpty()){
            stack.push(value);
        }else {
            int a =stack.peek();
            stack.pop();
            insertAtBottom(value);
            stack.push(a);
        }
    }
    public static void reverse(){
        if (stack.isEmpty()){
            return;
        }else {
            int x = stack.peek();
            stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }

}
