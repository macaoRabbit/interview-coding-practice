package practice;

public class QSort3 {
    public static void main(String[] args) {
        char a[] = {'x', 'y', 'a', 'b', 'c', '1', '2', '3', 'z'};
        System.out.println(a);
        sort(a, 0, a.length - 1);
        System.out.println(a);
    }

    public static void sort(char a[], int start, int end) {
        if (end <= start) return;
        int index = partition(a, start, end);
        sort(a, start, index - 1);
        sort(a, index + 1, end);
    }

    public static int partition(char a[], int start, int end) {
        char pivot = a[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < end && a[i] < pivot) i++;
            while (j > start && a[j] > pivot) j--;
            if (i != j) swap(a, i, j);
        }
        if (a[start] > a[i]) swap(a, i, start);
        System.out.print( start + " " + end + " "  +  pivot  + " => ");
        System.out.println(a);
        return i;
    }

    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;

        System.out.print(a[i] + " " + a[j] + " -- "); System.out.println(a);
    }
}
