package String;

public class Question1_4 {
    public static String solution(char[] str) {
        int length = str.length;
        int space = 0;
        for (int i = 0; i < length - 1; i++) {
            if (str[i] == ' ') {
                space++;
            }
        }
        int newLength = length + space * 2;
        for (int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength] = '%';
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        return String.valueOf(str);
    }
}
