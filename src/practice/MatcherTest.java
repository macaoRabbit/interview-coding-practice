package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
    public static void main(String[] args) {
        String regex = "aa+";
        String text = "I am a bboy! aaa 1234 981 xyz";

        System.out.println(text + "<=  size: " + text.length() + "  | " + regex + "  ==> " + extracted(text, regex));
    }

    private static int extracted(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }
}
