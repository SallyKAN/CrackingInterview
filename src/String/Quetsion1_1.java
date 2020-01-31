package String;

public class Quetsion1_1 {
    public static boolean isDiff(String str) {
        if (str.length() == 0 || str == null){
            return true;
        }
        char[] chars = str.toCharArray();
        boolean[] map = new boolean[256];
        for (int i=0;i<chars.length;i++){
            if (map[chars[i]]){
                return false;
            }
            map[chars[i]] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDiff("abcf"));
    }
}
