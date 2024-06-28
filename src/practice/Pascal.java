package practice;

public class Pascal {

	public static void main(String[] args) {
		for (int n = -11; n < 7; n++)
			pascal(n);
	}

	private static void pascal(int n) {
		if (n <= 0)
			return;
		int a[] = new int[n];
		a[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (j == i) {
					a[j] = 1;
				} else {
					a[j] = a[j] + a[j - 1];
				}
			}
			print(a);
		}
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

}
