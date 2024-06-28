package practice;

public class Prime2 {
    public static void main(String[] args) {
        int n = 100;
        int a[] = new int [n];
        doPrime(a);
    }
    public static void doPrime(int a[]) {
        a[0] = 1;
        for (int i=2; i<a.length/2; i++) {
            if (a[i] == 0) {
                for (int j=i; i*j < a.length; j++) {
                    a[i * j] = 1;
                }
            }
        }
        for (int i = 0; i<a.length; i++) {
            if (a[i] == 0) {
                System.out.print(i + " - ");
            }
        }
        System.out.println();
    }
}
