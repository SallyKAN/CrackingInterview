package String;

public class onlyOnce {
    public static boolean solution(String str) {
        if (str == null || str == "") {
            return false;
        }
        char[] chars = str.toCharArray();
        boolean[] map = new boolean[256];
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i]]){
                return false;
            }
            map[chars[i]] = true;
        }
        return true;
    }
}
