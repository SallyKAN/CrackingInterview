package String;

public class binarySearch {
    public static int solution(String[] strs, String str) {
        if (strs.length == 0 || str == null) {
            return -1;
        }
        int res = -1;
        int left = 0;
        int right = strs.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (strs[mid] != null && strs[mid] != str) {
                if (strs[mid].compareTo(str) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return 0;
    }
}
