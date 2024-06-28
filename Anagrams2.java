package practice;

import java.util.*;

public class Anagrams2 {
    public static void main(String[] args) {
        String s1 = "I am a boy";
        String s2 = "I am a boy";
        System.out.println(s1 + " - " + s2 + "  is Anagrams? " + isAnagrams(s1, s2));
        s1 = "I am a boy";
        s2 = "I am a girl";
        System.out.println(s1 + " - " + s2 + "  is Anagrams? " + isAnagrams(s1, s2));
        s1 = "I am a boy";
        s2 = "I am a girl";
        System.out.println(s1 + " - " + s2 + "  is AnagramsII? " + isAnagramsII(s1, s2));
        s1 = "I am a boy";
        s2 = "I am a boy";
        System.out.println(s1 + " - " + s2 + "  is AnagramsII? " + isAnagramsII(s1, s2));
    }
    public static boolean isAnagrams(String s1, String s2) {
        boolean yesNo = true;
        Map<String, Integer> m = new HashMap<>();
        for (char a : s1.toCharArray()) {
            String t = "" + a;
            Integer count = m.get(t);
            if (count == null) {
               count = 1;
            } else { count = count + 1;}
            m.put(t, count);
        }
        for (char a: s2.toCharArray()) {
            String t = "" + a;
            Integer count = m.get(t);
            if (count == null) {
                return false;
            } else {
                count--;
                if (count > 0) {
                    m.put(t, count);
                } else {
                    m.remove(t);
                }
            }
        }
        if (m.size() == 0) {
            return true;
        }
        return yesNo;
    }
    public static boolean isAnagramsII(String s1, String s2) {
        boolean yesNo = false;
        String a1 = make(s1);
        String a2 = make(s2);
        if (a1.equalsIgnoreCase(a2)) {
            return true;
        }
        return yesNo;
    }
    public static String make(String s1) {
        List<String> l1 = new ArrayList<>();
        for (char a: s1.toCharArray()) {
            l1.add("" + l1);
        }
        Collections.sort(l1);
        StringBuilder b = new StringBuilder();
        for (String s: l1) {
            b.append(s);
        }
        return b.toString();
    }
}
