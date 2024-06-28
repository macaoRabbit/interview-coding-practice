package practice;

public class Rotation {
    public static void main(String[] args) {
        char a[] = "abcdefghijk".toCharArray();
        int n =13;
        System.out.println(a);
        doRotate(a, n);
        System.out.println(a);
    }

    private static void doRotate(char[] a, int r) {
        int n = r%a.length;
        char t[] = new String(a).substring(0, n).toCharArray();
        for (int i = 0; i < a.length - n; i++) {
            a[i] = a[i + n];
        }
        for (int j = 0; j < t.length; j++) {
            a[j + a.length - n] = t[j];
        }
    }
}
