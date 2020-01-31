package Java;

//import java.util.Iterator;
//
//public class CircularArray<T> implements Iterable<T> {
//    private T[] items;
//    private int head = 0;
//
//    public CircularArray(int size) {
//        items = (T[]) new Object[size];
//    }
//
//    private int convert(int index) {
//        if (index < 0) {
//            index += items.length;
//        }
//        return (head + index) % items.length;
//    }
//
//    public void rotate(int shiftRight) {
//        head = convert(shiftRight);
//    }
//
//    public T get(int index) {
//        if (index < 0 || index > items.length) {
//            throw new java.lang.IndexOutOfBoundsException("index out of bounds");
//        }
//        return items[convert(index)];
//    }
//
//    public void set(int i, T item) {
//        items[convert(i)] = item;
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return new CircularArrayIterator<T>(this);
//    }
//
//    private class CircularArrayIterator<T1> implements Iterator<T1> {
//
//
//
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public T next() {
//            return null;
//        }
//
//        @Override
//        public void remove() {
//
//        }
//    }
//}
