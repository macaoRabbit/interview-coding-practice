package practice;

public class Prime3 {
    public static void main(String[] args) {
        int n = 100;
        int a[] = new int[n];
        doPrime(a);
        printPrime(a);
    }

    public static void doPrime(int a[]) {
        a[0] = 1;
        for (int i = 2; i <= a.length / 2; i++) {
            if (a[i] == 0) {
                for (int j = i; j * i < a.length; j++) {
                    a[i * j] = 1;
                }
            }
        }
    }

    public static void printPrime(int a[]) {
        for (int i=1; i<a.length; i++) {
            if (a[i] == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
