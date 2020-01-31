package String;

public class QUestion1_6 {
    public static int solution(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int num = 0;
        int res = 0;
        boolean posi = true;
        char[] chars = str.toCharArray();
        int cur = 0;
        for (int i = 0; i < chars.length; i++) {
            cur = chars[i] - '0';
            if (cur < 0 || cur > 9) {
                res += num;
                num = 0;
                if (chars[i] == '-') {
                    posi = false;
                    if (chars[i - 1] == '-') {
                        posi = !posi;
                    }
                }
            } else {
                num = num * 10 + (posi ? cur : -cur);
            }
        }
        res += num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution("b-12c-234"));
    }
}

