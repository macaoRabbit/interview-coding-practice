package practice;

public class Combination {

	public static void main(String[] args) {
		int level = 5;
		int a[] = new int[level];
		for (int i = 0; i < level; i++)
			generate(a, 0, i);
	}

	private static void generate(int[] a, int position, int level) {
		if (level == 0)
			return;
		if (position == level) {
			print(a, level);
			return;
		}
		a[position] = 0;
		generate(a, position+1, level);
		a[position] = 1;
		generate(a, position+1, level);
	}

	private static void print(int[] a, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
