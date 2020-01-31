package LinkedList;

import java.util.Stack;

public class isPalindrome {
    public boolean isPalindrome(Node head) {
        if (head == null) {
            return false;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.value != stack.pop().value){
                return false;
            }
        }
        return true;
    }
}
