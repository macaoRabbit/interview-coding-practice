package practice;

public class BasicSorting {

	public static void main(String[] args) {
		final char[] s = { 'b', 'a', 'c' };
		System.out.print("before- ");
		System.out.println(s);
		bubleSort(s);
		System.out.print("after - ");
		System.out.println(s);
		s[0] = 'd';
		System.out.print("before- ");
		System.out.println(s);
		selectionSort(s);
		System.out.print("after - ");
		System.out.println(s);
	}

	private static void selectionSort(char[] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = i; j < s.length; j++) {
				if (s[i] > s[j]) {
					swap(s, i, j);
				}
			}
		}
	}

	private static void swap(char[] s, int i, int j) {
		final char t = s[i];
		s[i] = s[j];
		s[j] = t;
	}

	private static void bubleSort(char[] s) {
		for (int i = 1; i < s.length; i++) {
			for (int j = i; j > 0; j--) {
				if (s[j] < s[j - 1]) {
					swap(s, j, j - 1);
				}
			}
		}
	}

}
