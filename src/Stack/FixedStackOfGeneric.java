package Stack;

public class FixedStackOfGeneric<Item> {
    private Item[] a;
    private int N;

    public FixedStackOfGeneric(int N) {
        a = (Item[]) new Object[N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public Item pop() {
//        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return a[--N];
    }

    public void push(Item item) {
//        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

//    private void resize(int size) {
//        Item[] temp = (Item[]) new Object[size];
//        for (int i = 0; i < N; i++) {
//            temp[i] = a[i];
//        }
//        a = temp;
//    }


}
