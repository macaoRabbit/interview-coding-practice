package practice;

public class StringReplace {

	public static void main(String[] args) {
		char s[] = "Tone is one".toCharArray();
		char p[] = "one".toCharArray();
		char r[] = "ab".toCharArray();
		System.out.println(new String(s) + " - " + new String(p) + " - " + new String(r));
		replaceString(s, p, r);
		System.out.println(s);
		s = "This one is another tone now".toCharArray();
		p = "one".toCharArray();
		r = "ab".toCharArray();
		System.out.println(new String(s) + " - " + new String(p) + " - " + new String(r));
		replaceString(s, p, r);
		System.out.println(s);
		s = "This one is another tone now".toCharArray();
		p = "one".toCharArray();
		r = "ab".toCharArray();
		System.out.println(new String(s) + " - " + new String(p) + " - " + new String(r));
		replaceString(s, p, r);
		System.out.println(s);
		s = "This one is another tone now on".toCharArray();
		p = "one".toCharArray();
		r = "ab".toCharArray();
		System.out.println(new String(s) + " - " + new String(p) + " - " + new String(r));
		replaceString(s, p, r);
		System.out.println(s);
	}

	private static void replaceString(char[] s, char[] p, char[] r) {
		if (s.length == 0 || p.length == 0 || r.length == 0 || p.length < r.length)
			return;
		int i = 0; int current =0;
		while (i < s.length) {
			boolean found = true;
			int j = 0;
			while (j<p.length && i + j < s.length) {
				if (s[i + j] != p[j]) {
					found = false;
					break;
				} else j++;
			}
			if (j<p.length) found = false;
			if (found) {
				for (int k=0; k<r.length; k++) {
					s[current] = r[k];
					current++;
				}
				i += p.length;
			} else {
				s[current++] = s[i++];
			}
		}
		for (int j = current; j< s.length; j++) {
			s[j] = '*';
		}
	}
}
