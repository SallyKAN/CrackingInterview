package LinkedList;

public class listPartition {
    public Node listPartition(Node head, int pivot) {
        if (head == null) {
            return head;
        }
        Node cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            cur = cur.next;
        }
        Node[] arr = new Node[i];
        i = 0;
        cur = head;
        for (i = 0; i < arr.length; i++) {
            arr[i] = cur;
            cur = cur.next;
        }
        arrPartition(arr, pivot);
        for (i = 1; i < arr.length; i++) {
            arr[i - 1].next = arr[i];
        }
        arr[i - 1].next = null;
        return arr[0];
    }

    public void arrPartition(Node[] arr, int pivot) {
        int small = -1;
        int big = arr.length;
        int index = 0;
        while (index != big) {
            if (arr[index].value < pivot) {
                swap(arr, ++small, index++);
            } else if (arr[index].value == pivot) {
                index++;
            }else {
                swap(arr,--big,index);
            }
        }
    }

    public void swap(Node[] arr, int index1, int index2) {
        Node temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
