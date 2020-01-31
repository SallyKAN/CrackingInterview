package String;

import java.util.HashMap;

public class minDistanceMap {
    public static HashMap<String, HashMap<String, Integer>> build(String[] strings) {
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            HashMap<String, Integer> record = new HashMap<>();
            record.put(strings[i], i);
            map.put(strings[i], record);
        }
        return map;
    }

//    public static int solution(String[] strings, String str1, String str2) {
//
//    }

    public static void main(String[] args) {

    }
}
