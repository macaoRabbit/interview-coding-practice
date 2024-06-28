package practice;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String a = "I am a boy";
        String b = "boy a am I";
        System.out.println(a + "----" + b + " is anagrams? " + isAnagram(a, b));
        a = "I am a boy";
        b = "I boy a am I";
        System.out.println(a + "----" + b + " is anagrams? " + isAnagram(a, b));
    }

    public static boolean isAnagram(String a, String b) {
        boolean yesNo = true;
        if (a == null && b == null) return yesNo;
        if (a == null && b != null || a != null && b == null) return false;
        if (a.length() != b.length()) return false;

        Map<String, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {
            String t = new String("" + c);
            Integer count = map.get(t);
            if (count == null) {
                map.put(t, 1);
            } else {
                map.put(t, count + 1);
            }
        }
        System.out.println(map);
        for (char c : b.toCharArray()) {
            String t = new String("" + c);
            Integer count = map.get(t);
            if (count == null) {
                return false;
            } else {
                count--;
                if (count == 0) {
                    map.remove(t);
                } else {
                    map.put(t, count);
                }
            }
        }
        System.out.println(map);
        if (map.size() > 0) return false;
        return yesNo;
    }
}
