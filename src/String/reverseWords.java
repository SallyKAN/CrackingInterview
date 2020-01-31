package String;

public class reverseWords {
    public static void main(String[] args) {
        String test = new String("asdfgh");
        char[] chars = test.toCharArray();
//        for (int i = 0; i < chars.length / 2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length - i -1];
//            chars[chars.length - i -1] = temp;
//        }
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.valueOf(chars));
    }
}
