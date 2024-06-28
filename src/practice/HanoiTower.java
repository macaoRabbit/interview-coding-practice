package practice;

public class HanoiTower {

	public static void main(String[] args) {
		int n = 3;
		doHanoi(n, 'a', 'b', 'c');
	}

	private static void doHanoi(int n, char s, char t, char spare) {
		if (n <= 0) {
			System.out.println("n = 0 no move!");
			return;
		}
		if (n == 1) {
			System.out.println("move " + (char) s + " to " + t);
			return;
		}
		doHanoi(n - 1, s, spare, t);
		System.out.println("move " + (char) s + " to " + (char) t);
		doHanoi(n - 1, spare, t, s);
	}

}
