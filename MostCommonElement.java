package practice;

import java.util.Stack;

public class MostCommonElement {
    public static void main(String[] args) {
        char a[] = {'a', 'a', 'a', 'a', 'c', 'c', 'c', 'c', 'c'};
        System.out.print(a);
        System.out.println(" ==> Most Common Element is: " + mostCommon(a));
        System.out.print(a);
        System.out.println(" ==> Most Common Element is: " + mostCommonAgain(a));
    }

    public static char mostCommon(char a[]) {
        char common = '0';
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (count == 0) {
                common = a[i];
                count++;
            } else if (a[i] == common) {
                count++;
            } else if (a[i] != common) {
                count--;
            }
        }
        return common;
    }


    public static char mostCommonAgain(char a[]) {
        Stack<String> s = new Stack();
        for (int i=0; i<a.length; i++) {
            if (s.empty()) {
                s.push("" + a[i]);
            } else if (a[i] == s.peek().charAt(0)) {
                s.push("" + a[i]);
            } else {
                s.pop();
            }
        }
        return s.peek().charAt(0);
    }
}
