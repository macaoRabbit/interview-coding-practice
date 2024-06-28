package practice;

import java.util.HashSet;
import java.util.Set;

public class Color {
    public static void main(String[] args) {
        String a = "12345";
        System.out.println(a + " --- " + isColor(a));
    }

    private static boolean isColor(String a) {
        Set<Integer> p = new HashSet();
        boolean isColor = true;
        for (int i = 1; i <= a.length(); i++) {
            System.out.print(i + " --");
            Integer first = -1;
            for (int j = 0; j < a.length() - i + 1; j++) {
                String s = a.substring(j, j + i);
                Integer second = Integer.parseInt(s);
                Integer product = first * second;
                if (product > 0) {
                    if (p.contains(product)) {
                        return false;
                    }
                    p.add(product);
                }
                first = second;
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println(p);
        }
        return isColor;
    }
}
