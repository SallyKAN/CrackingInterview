package String;

public class minDistance {
    public static int solution(String[] str, String str1, String str2) {
        if (str1 == null || str2 == null) {
            return -1;
        }
        int last1 = -1;
        int last2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(str1)) {
                min = Math.min(min, last2 == -1 ? min : i - last2);
                last1 = i;
            }
            if (str[i].equals(str2)) {
                min = Math.min(min, last1 == -1 ? min : i - last1);
                last2 = i;
            }
        }
        return min == Integer.MAX_VALUE? -1 : min;
    }

    public static void main(String[] args) {
        String[] tests = new String[]{"a","b","c","d","e","f","a","b","g"};
        System.out.println(solution(tests,"a","b"));
    }
}
