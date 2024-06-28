package practice;

public class StringReplace2 {
    public static void main(String[] args) {
        String a = "I have a dog and one more dog";
        String p = "dog";
        String r = "ELEPHANT";
        System.out.println(a + " - " + p + " - " + r +  " ==> " + replace(a, p, r));
    }

    public static String replace(String a, String p, String r) {
        if (a == null || p == null || r == null || p.length() == 0) return a;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i<a.length(); i++) {
            boolean found = true;
            for (int j=0; j<p.length(); j++) {
                if (a.charAt(i+j) != p.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (p.length() > 0 && found) {
                s.append(r);
                i = i + p.length() - 1;
            } else {
                s.append(a.charAt(i));
            }
        }
        return s.toString();
    }
}
