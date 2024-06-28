package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median3 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 11, 10, 8, 6, 4, 2};
        double m[] = new double[a.length];
        doMedian(a, m);
        printInt(a);
        printDouble(m);
    }
    public static void doMedian(int a[], double m[]) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int i=0; i<a.length; i++) {
            if (small.size() == 0 || a[i] <= small.get(small.size() - 1)) {
                small.add(a[i]);
                Collections.sort(small);
            } else {
                large.add(a[i]);
                Collections.sort(large);
            }
            if (large.size() > small.size()) {
                int t = large.get(0);
                small.add(t);
                large.remove(0);
            }
            if (small.size() > large.size()) {
                m[i] = (double) small.get(small.size() - 1);
            } else {
                m[i] = 0.5 * (small.get(small.size() - 1) + large.get(0));
            }
        }
    }

    public static void printInt(int a[]) {
        for (int i =0 ; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void printDouble(double a[]) {
        for (int i = 0; i<a.length; i++)  {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
