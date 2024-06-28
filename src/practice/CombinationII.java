package practice;

public class CombinationII {
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];
        doComb(a, 0, n);
    }

    private static void doComb(int[] a, int i, int n) {
        if (a.length == 0 || n == 0 ) return;
        if (i == n) {
            print(a);
            return;
        }
        a[i]=1;
        doComb(a, i+1, n);
        a[i]=0;
        doComb(a, i+1, n);}

    private static void print(int[] a) {
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
