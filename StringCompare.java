package practice;

public class StringCompare {

	public static void main(String[] args) {
		String a = "abcdefe";
		String b = "abcdeff";
		System.out.println("a=" + a + " b=" + b + " isEqual:" + isEqual(a, b));
	}

	private static boolean isEqual(String a, String b) {
		boolean yesNo = true;
		if (a == null && b == null) {
			return true;
		} else if (a == null && b != null || a != null && b == null) {
			return false;
		} else if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					yesNo = false;
					break;
				}
			}
		}
		return yesNo;
	}

}
