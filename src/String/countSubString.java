package String;

public class countSubString {
    public static String solution(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] chars = str.toCharArray();
        int count = 1;
        char start = chars[0];
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == start) {
                count++;
            } else {
                sb.append(start + "_" + count + "_");
                start = chars[i];
                count = 1;
            }
        }
        sb.append(start+"_"+count);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbbaccffrccc"));
    }
}
