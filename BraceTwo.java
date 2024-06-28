package practice;

import java.util.Stack;

public class BraceTwo {
    public static void main(String[] args) {
        char a[] = "(a(b)c)".toCharArray();
        System.out.println(new String(a) + " ==> " + balance(a));
        a = "(a((b)c))))((".toCharArray();
        System.out.println(new String(a) + " ==> " + balance(a));
    }

    public static String balance(char a[]) {
        StringBuilder b = new StringBuilder();
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        Stack<String> s3 = new Stack<>();
        for (int i=0; i<a.length; i++) {
            if (a[i] == '(') {
                s1.push("" + a[i]);
                s2.push("" + a[i]);
            } else if (a[i] == ')') {
                if (!s2.empty()) {
                    s1.push("" + a[i]);
                    s2.pop();
                }
            } else {
                s1.push("" + a[i]);
            }
        }
        s2.clear();
        while (!s1.empty()) {
            char t = s1.pop().toCharArray()[0];
            if (t == ')') {
                s3.push("" + t);
                s2.push("" + t);
            } else if (t == '(') {
                if (!s2.empty()) {
                    s3.push("" + t);
                    s2.pop();
                }
            } else {
                s3.push("" + t);
            }
        }
        while (!s3.empty()) {
            b.append(s3.pop());
        }
        return b.toString();
    }
}
