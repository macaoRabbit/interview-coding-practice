package practice;

public class QuickieSort {
    public static void main(String[] args) {
        char a[] = {'b', 'c', 'x', 'y', 'z', 'm', 'q'};
        System.out.println(a);
        qSort(a, 0, a.length - 1);
        System.out.println(a);
    }

    public static void qSort(char a[], int start, int end) {
        if (end > start) {
            int p = partition(a, start, end);
            qSort(a, start, p - 1);
            qSort(a, p + 1, end);
        }
    }

    public static int partition(char a[], int start, int end) {
        int i = start;
        int j = end;
        char pivot = a[start];
        while (i < j) {
            while (i < end && a[i] < pivot) i++;
            while (j > start && a[j] > pivot) j--;
            if (i != j) swap(a, i, j);
        }
        if (a[start] > a[i]) swap(a, start, i);
        return i;
    }

    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
