package practice;

public class PowerKAgain {
    public static void main(String[] args) {
        long b = 62;
        long k = 7;
        System.out.println(b + " - " + k + " => " + powerK(b, k));
    }
    public static long powerK(long b, long k) {
        if (k<0) return 0;
        if (k==0) return 1;
        if (k==1) return b;

        long half = k/2;
        long halfK = powerK(b, half);
        long fullK = halfK * halfK;
        if (k%2 == 1) {
            fullK = fullK * b;
        }
        return fullK;
    }
}
