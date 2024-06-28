package practice;

public class QSort {
    public static void main(String[] args) {
        char a[] = "tuxykomnbacfgz".toCharArray();
        System.out.println(a);
        quick(a, 0, a.length - 1);
        System.out.println(a);
    }

    private static void quick(char[] a, int start, int end) {
        if (start >= end) return;
        int index = partition(a, start, end);
        quick(a, start, index - 1);
        quick(a, index + 1, end);
    }

    private static int partition(char[] a, int start, int end) {
        char pivot = a[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < end && a[i] < pivot) i++;
            while (j > start && a[j] > pivot) j--;
            if (i != j) {
                swap(a, i, j);
            }
        }
        if (pivot > a[i]) {
            swap(a, i, start);
        }
        return i;
    }

    private static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
