package practice;

public class MatchingPair {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abc";
        System.out.println(s + " " + t + "  - " + swapAndCountPairs(s.toCharArray(), t.toCharArray()));
        s = "abcd";
        t = "abcd";
        System.out.println(s + " " + t + "  - " + swapAndCountPairs(s.toCharArray(), t.toCharArray()));
    }

    public static int swapAndCountPairs(char s[], char t[]) {
        int max = 0;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
//                System.out.println(i + " " + j + " " + new String(s));
                swap(s, i, j);
                int p = countPairs(s, t);
                if (p > max) {
                    max = p;
                }
                swap(s, i, j);
//                System.out.println(i + " " + j + " " + new String(s));
            }
        }
        return max;
    }

    static int countPairs(char s[], char t[]) {
        int p = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == t[i]) {
                p++;
            }
        }
//        System.out.println(" " + new String(s) + " " + new String(t) + " " + p);
        return p;
    }

    public static void swap(char s[], int i, int j) {
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }
}
