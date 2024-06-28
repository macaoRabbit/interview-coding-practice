package practice;

public class Permutation {

	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c' };
		permute(a, 0, a.length);
	}

	private static void permute(char[] a, int position, int n) {
		if (n == 0)
			return;
		if (n == position) {
			print(a);
		}
		for (int i = position; i < n; i++) {
			swap(a, i, position);
			permute(a, position + 1, n);
			swap(a, i, position);
		}
	}

	private static void swap(char[] a, int i, int position) {
		char t = a[i];
		a[i] = a[position];
		a[position] = t;
	}

	private static void print(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print((char) a[i]);
			System.out.print(' ');
		}
		System.out.println();
	}

}
