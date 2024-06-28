package practice;

public class CyberCoder {
    public static void main(String[] args) {
        String s = "abc-012-XYZ";
        int n = 3;
        System.out.println(s + " ==> " + cyberCoder(s, n));
    }
    public static String cyberCoder(String s, int n) {
        char a[] = s.toCharArray();
        for (int i=0; i<a.length; i++) {
            a[i] = code(a[i], n);
        }
        return new String(a);
    }
    public static char code(char c, int n) {
        if ('a' <= c && c <= 'z') return small(c, n);
        if ('A' <= c && c <= 'Z') return big(c, n);
        if ('0' <= c && c <= '9') return number(c, n);
        return c;
    }
    public static char small(char c, int n) {
        return (char)  ('a' + (c - 'a' + n) % 26);
    }
    public static char big(char c, int n) {
        return (char)  ('A' + (c - 'A' + n) % 26);
    }
    public static char number(char c, int n) {
        return (char)  ('0' + (c - '0' + n) % 10);
    }
}
