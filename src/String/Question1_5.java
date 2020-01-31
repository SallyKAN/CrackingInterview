package String;

public class Question1_5 {
    public static String solution(String str) {
        char[] chars = str.toCharArray();
        int number = 1;
        StringBuffer sb = new StringBuffer();
        char last = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == last) {
                number++;
            } else {
                sb.append(last);
                sb.append(number);
                number = 1;
                last = chars[i];
            }
        }
        sb.append(last);
        sb.append(number);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aaabbccwee"));
    }
}
