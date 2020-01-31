package LinkedList;

public class reversePart {
    public Node reversePart(Node head, int from, int to) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fPre = null;
        Node tPost = null;
        int len = 0;
        Node node1 = head;
        while (node1 != null) {
            len++;
            fPre = from - 1 == len ? node1 : fPre;
            tPost = to + 1 == len ? node1 : tPost;
            node1 = node1.next;
        }
        if (from < 1 || from > to || to > len) {
            return head;
        }
        node1 = fPre == null ? fPre : fPre.next;
        Node node2 = node1.next;
        node1.next = tPost;
        Node next = null;
        while (node2 != null) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (fPre != null) {
            fPre.next = node1;
            return head;
        }
        return node1;
    }
}
