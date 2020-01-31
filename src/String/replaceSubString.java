package String;

public class replaceSubString {
    public static String solution(String str, String from, String to) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] strChars = str.toCharArray();
        char[] fromChars = from.toCharArray();
        int match = 0;
        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] == fromChars[match]) {
                match++;
                if (match == fromChars.length) {
                    clear(strChars, i, match);
                    match = 0;
                }
            } else {
                match = 0;
            }
        }
        StringBuffer cur = new StringBuffer();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] != 0) {
                cur.append(strChars[i]);
            }
            if (strChars[i] == 0 && (strChars[i - 1] != 0 || i == 0)) {
                res.append(cur);
                res.append(to);
                cur.delete(0,cur.length());
            }
        }
        if (cur.toString().length() != 0){
            res.append(cur);
        }
        return res.toString();
    }

    public static void clear(char[] chars, int end, int length) {
        while (length-- != 0) {
            chars[end--] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abc12312312312","123","x"));
    }
}
