package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 100;
		prime(n);
	}

	private static void prime(int n) {
		if (n<0) return;
		int a[] = new int[n + 1];
		print(a);
		a[0] = 1;
		for (int i = 2; i < a.length / 2; i++) {
			if (a[i] == 0) {
				for (int j = i; j * i <= n; j++) {
					a[j * i] = 1;
				}
			}
		}
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				System.out.print(" " + i);
		}
		System.out.println();
	}

}
