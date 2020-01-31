package String;

import java.util.Stack;

public class removeKZeros2 {
    static class entity {
        char Character;
        int frequency;

        public entity(char c, int f) {
            this.Character = c;
            this.frequency = f;
        }
    }

    static String removeKZeros(String str, int k) {
        Stack<entity> stack = new Stack<>();
        int n = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && stack.peek().frequency == k) {
                char cur = chars[i];
            }
        }
        return null;
    }
}
