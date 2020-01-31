package Stack;

import java.util.Stack;

public class getMin {

}

class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack(){
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int value) {
        if (stackMin.isEmpty()) {
            this.stackMin.push(value);
        } else if (value <= stackMin.peek()) {
            this.stackMin.push(value);
        }
        this.stackData.push(value);
    }

    public int pop() {
        if (this.stackData.isEmpty()){
            throw new RuntimeException();
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
             this.stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (this.stackMin.isEmpty()){
            throw new RuntimeException();
        }
        return stackMin.peek();
    }

}