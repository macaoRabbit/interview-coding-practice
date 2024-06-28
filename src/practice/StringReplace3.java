package practice;

public class StringReplace3 {
    public static void main(String[] args) {
        char s[] = "I am a boy and a boy".toCharArray();
        char p[] = "boy".toCharArray();
        char r[] = "son".toCharArray();
        System.out.print("" + new String(s) + " | " + new String(p) + " - " + new String(r) + " ==> ");
        replace(s, p, r);
        System.out.println(s);
        s = "I am a boy and a boy".toCharArray();
        p = "boy".toCharArray();
        r = "on".toCharArray();
        System.out.print("" + new String(s) + " | " + new String(p) + " - " + new String(r) + " ==> ");
        replace(s, p, r);
        System.out.println(s);
    }

    public static void replace(char s[], char p[], char r[]) {
        if (s.length == 0 || p.length == 0 || r.length == 0) return;
        if (p.length < r.length) return;
        int ptr = 0;
        for (int i = 0; i< s.length; i++) {
            boolean found = true;
            for (int j=0; j<p.length; j++) {
                if (s[i + j] != p[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                for (int j=0; j<r.length; j++) {
                    s[ptr] = r[j];
                    ptr++;
                }
                i = i + p.length - 1;
            } else {
                s[ptr] = s[i];
                ptr++;
            }
        }
        for (int i = ptr; i<s.length; i++) {
            s[i] = '-';
        }
    }
}
