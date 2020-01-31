package LinkedList;

public class commonList {
    public void commonList(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        while (cur1 != null && cur2 != null) {
            if (cur1.value < cur2.value) {
                cur1 = cur1.next;
            } else if (cur1.value > cur2.value) {
                cur2 = cur2.next;
            } else {
                System.out.println(cur1.value + " ");
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        System.out.println();
    }
}
