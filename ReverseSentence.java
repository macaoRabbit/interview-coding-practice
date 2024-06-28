package practice;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "I am a boy";
        System.out.println(s + " --> " + reverseS(s));
    }

    public static String reverseS(String s) {
        if (s.length() <= 1) return s;
        StringBuilder b = new StringBuilder();
        char a[] = s.toCharArray();
        reverse(a, 0, a.length - 1);
        int ptr = 0;
        int start;
        int end;
        while (ptr < s.length()) {
            start = ptr;
            int j = 0;
            while ( start + j < s.length() && a[start + j] != ' ' ) j++;
            if (start + j != s.length() - 1) {
                reverse(a, start, start + j - 1);
                ptr = start + j + 1;
            } else {
                reverse(a, start, start + j);
            }
            ptr = start + j + 1;
        }
        b.append(a);
        return b.toString();
    }

    public static void reverse(char a[], int start, int end) {
        if (end <= start) return;
        for (int i = 0; i < (end - start) / 2 + 1; i++) {
            swap(a, start + i, end - i);
        }
    }

    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
