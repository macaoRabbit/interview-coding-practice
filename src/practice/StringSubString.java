package practice;

public class StringSubString {

	public static void main(String[] args) {
		String s = "this is a good apple";
		String t = "bad";
		System.out.println(s + " - " + t + "-  subString? " + isSubstring(s, t));
		t = "is";
		System.out.println(s + " - " + t + "-  subString? " + isSubstring(s, t));
		s = "is";
		t = "is";
		System.out.println(s + " - " + t + "-  subString? " + isSubstring(s, t));
		s = "a";
		t = "b";
		System.out.println(s + " - " + t + "-  subString? " + isSubstring(s, t));
		s = "a";
		t = "a";
		System.out.println(s + " - " + t + "-  subString? " + isSubstring(s, t));
	}

	private static boolean isSubstring(String s, String t) {
		if (s.length() == 0 || t.length() == 0)
			return false;
		for (int i = 0; i < s.length() - t.length() + 1; i++) {
			int j = 0;
			boolean yesNo = true;
			while (j < t.length()) {
				if (s.charAt(i + j) != t.charAt(j)) {
					yesNo = false;
					break;
				}
				j++;
			}
			if (j == t.length())
				return yesNo;
		}
		return false;
	}
}
