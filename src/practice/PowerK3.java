package practice;

public class PowerK3 {
    public static void main(String[] args) {
        long base = 62;
        long power = 10;
        System.out.println("base: " + base +  " power: " + power  + " powerK = " + powerK(base, power));
    }

    public static long powerK(long base, long power) {
        if (power == 0) return 1;
        if (power == 1) return base;
        if (power == 2) return base * base;
        long product = 1;
        long half = power/2;
        long halfPower = powerK(base, half);
        product = halfPower * halfPower;
        if (half * 2 != power) {
            product *= base;
        }
        return product;
    }
}
