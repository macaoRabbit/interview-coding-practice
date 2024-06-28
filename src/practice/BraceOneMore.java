package practice;

import java.util.Stack;

public class BraceOneMore {
    public static void main(String[] args) {
        String s = "(a)c)(";
        System.out.println(s + " => " + doBalance(s.toCharArray()));
        s = "((ab)c)))(ab(dd)";
        System.out.println(s + " => " + doBalance(s.toCharArray()));
    }
    public static String doBalance(char a[]) {
        StringBuilder b = new StringBuilder();
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        for (int i=0; i<a.length; i++) {
            if (a[i] == '(') {
                s1.push(String.valueOf(a[i]));
                s2.push(String.valueOf(a[i]));
            } else if (a[i] == ')') {
                if (!s2.empty()) {
                    s2.pop();
                    s1.push(String.valueOf(a[i]));
                }
            } else {
                s1.push(String.valueOf(a[i]));
            }
        }
        Stack<String> s3 = new Stack<>();
        s2.clear();
        int k = s1.size();
        for (int i=0; i<k; i++) {
            char t = s1.pop().toCharArray()[0];
            if (t == ')') {
                s3.push(String.valueOf(t));
                s2.push(String.valueOf(t));
            } else if (t == '(') {
                if (!s2.empty()) {
                    s2.pop();
                    s3.push(String.valueOf(t));
                }
            } else {
                s3.push(String.valueOf(t));
            }
        }
        while(!s3.empty()) {
            b.append(s3.pop());
        }
        return b.toString();
    }
}
