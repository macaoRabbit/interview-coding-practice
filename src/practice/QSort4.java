package practice;

public class QSort4 {
    public static void main(String[] args) {
        char a[] = { 'a', 'c', 'x', 'y', 'z', 'u', 't', 's', '0', '9', '1' };
        System.out.print(a);
        System.out.print(" ==> ");
        sort(a, 0, a.length - 1);
        System.out.println(a);
    }

    public static void sort(char a[], int start, int end) {
        if (start >= end) return;
        int index = partition(a, start, end);
        sort(a, start, index - 1);
        sort(a, index + 1, end);
    }

    public static int partition(char a[], int start, int end) {
        char pivot = a[start];
        int i = start;
        int j = end;
        while (i<j) {
            while (i<end && a[i] < pivot) i++;
            while (j>start && a[j] > pivot) j--;
            if (i != j) swap(a, i, j);

        }
        if (a[i] < pivot) swap(a, 0, i);
        return i;
    }

    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
