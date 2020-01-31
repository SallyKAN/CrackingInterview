package String;

public class StringToInt {
    public static boolean isValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toCharArray();
        if (chars[0] != '-' && chars.length == 1) {
            return false;
        }
        if (chars[0] == '-' && (chars[1] == 0 || chars[1] < '0' || chars[1] > '9')) {
            return false;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static int solution(String str) {
        char[] chars = str.toCharArray();
        if (!isValid(str)) {
            return 0;
        }
        boolean posi = chars[0] == '-' ? false : true;
        int minq = Integer.MIN_VALUE / 10;
        int minr = Integer.MIN_VALUE % 10;
        int cur = 0;
        int res = 0;
        for (int i = posi ? 0 : 1; i < chars.length; i++) {
            cur = '0' - chars[i];
            if (res < minq) {
                return 0;
            }
            if (res == minq && (cur < minr)){
                return 0;
            }
            res = res * 10 +cur;
        }
        if (!posi && res==Integer.MIN_VALUE){
            return 0;
        }
        return posi?-res:res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("0123"));
    }
}
