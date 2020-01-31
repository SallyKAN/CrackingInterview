package LinkedList;

public class removeMidNode {
    public Node remove(Node head){
        if (head == null || head.next == null){
            return head;
        }
        if (head.next.next == null){
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null){
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
