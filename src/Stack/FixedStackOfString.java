package Stack;

import java.util.Scanner;

public class FixedStackOfString {
    private String[] a;
    private int N;

    public FixedStackOfString(int size) {
        a = new String[size];
    }

    public String pop() {
        return a[--N];
    }

    public void push(String s) {
        a[N++] = s;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public static void main(String[] args) {
//        FixedStackOfString s = new FixedStackOfString(100);
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()){
//            String s1 = in.nextLine();
//            if (s1 != null){
//                s.push(s1);
//            }
//        }
//        while (!s.isEmpty()){
//            System.out.print(s.pop()+" ");
//        }
        System.out.println(System.getenv());
    }
}
