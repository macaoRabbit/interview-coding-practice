package practice;

public class PowerK {

	public static void main(String[] args) {
		int base = 2;
		int power = 32;
		MyCount count = new MyCount();
		System.out.println(
				"base=" + base + " power=" + power + " " + powerK(base, power, count) + " count:" + count.getCount());
	}

	private static int powerK(int base, int power, MyCount count) {
		count.setCount(count.getCount() + 1);
		if (power == 0)
			return 1;
		if (power == 1)
			return base;
		int oneMore = power % 2 == 0 ? 1 : base;
		int half = powerK(base, power / 2, count);
		int result = half * half * oneMore;
		return result;
	}
}

class MyCount {
	int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}