package practice;

public class CombinationEnumeration {

	public static void main(String[] args) {
		int level = 5;
		for (int i = 0; i < Math.pow(2, 5); i++) {
			printBinary(i, level);
		}
	}

	private static void printBinary(int number, int level) {
		int remaining = number;
		for (int i = 0; i < level; i++) {
			int digit = remaining & 1;
			System.out.print(digit);
			remaining = remaining >>> 1;
		}
		System.out.println("  " + number);
	}
}
