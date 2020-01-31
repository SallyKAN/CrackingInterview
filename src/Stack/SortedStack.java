package Stack;

import java.util.Stack;

public class SortedStack {
    private Stack<Integer> stack;
    private Stack<Integer> help;

    public SortedStack() {
        stack = new Stack<>();
        help = new Stack<>();
    }

    public void sort() {
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty()&&cur>help.peek()) {
                    stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        SortedStack st = new SortedStack();
        st.stack.push(6);
        st.stack.push(5);
        st.stack.push(4);
        st.stack.push(3);
        st.stack.push(2);
        st.stack.push(1);
        st.sort();
        while (!st.stack.isEmpty()) {
            System.out.println(st.stack.pop());
        }
    }
}
