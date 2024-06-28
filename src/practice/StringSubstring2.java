package practice;

public class StringSubstring2 {
    public static void main(String[] args) {
        String s = "I am a boy!";
        String p = "boy";
        System.out.println(s + " p= " + p + " is substring? " + substring(s, p));
        s = "I am a boy!";
        p = "xyz";
        System.out.println(s + " p= " + p + " is substring? " + substring(s, p));
    }
    public static boolean substring(String s, String p) {
        if (s == null || p == null || s.length() == 0 || p.length() == 0) {
            return false;
        }
        for (int i= 0; i<s.length() - p.length() + 1; i++) {
            boolean found = true;
            for (int j=0; j<p.length(); j++) {
                if (s.charAt(i+j) != p.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
}
