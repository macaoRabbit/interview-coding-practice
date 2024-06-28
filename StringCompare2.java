package practice;

public class StringCompare2 {

    public static void main(String args[]) {
        String s1 = "I am a boy";
        String s2 = "I am a boy";
        System.out.println(s1 + " -- " + s2 + " ==> " + compareThis(s1, s2));
        s1 = "I am a Girl";
        s2 = "I am a boy";
        System.out.println(s1 + " -- " + s2 + " ==> " + compareThis(s1, s2));
    }

    public static boolean compareThis(String s1, String s2) {
        boolean yesNo = true;
        if (s1 == null && s2 != null || s2 == null && s1 != null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return yesNo;
    }
}
