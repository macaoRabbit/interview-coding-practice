package practice;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 11;
        int result = doPower(base, power);
        System.out.println("do power base, power = " + base + " " + power + " " + result);
    }

    private static int doPower(int base, int power) {
        if (power == 0) return 1;
        if (power == 1) return base;
        int r = 1;
        int remain = power%2;
        int half = doPower(base, power/2);
        r = half * half;
        if (remain > 0) {
            r = base * r;
        }
        return r;
    }

}
