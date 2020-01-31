package LinkedList;

public class removeLastKDouble {
    public DoubleLinkedNode remove(DoubleLinkedNode head, int k) {
        if (head == null || k < 1) {
            return head;
        }
        DoubleLinkedNode cur = head;
        while (cur != null) {
            k--;
            cur = cur.next;
        }
        if (k == 0) {
            head = head.next;
            head.pre = null;
        }
        if (k < 0) {
            while (++k != 0) {
                cur = cur.next;
            }
            DoubleLinkedNode newNode = cur.next.next;
            cur.next = newNode;
            if (newNode != null){
                newNode.pre = cur;
            }
        }
        return head;
    }
}
