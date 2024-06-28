package practice;

import static practice.CombinationIII.print;

public class Pascal2 {
    public static void main(String[] args) {
        int n = 5;
        doPascal(n);
    }

    public static void doPascal(int n) {
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
           a[i] = 1;
           for (int j=i-1; j>0; j--) {
               a[j] = a[j] + a[j-1];
           }
            print(a);
        }
    }
}
