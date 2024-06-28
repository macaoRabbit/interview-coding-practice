package practice;

public class HeapSort {
    public static void main(String[] args) {
        char a[] = "I am a boy yet!".toCharArray();
        System.out.println(a);
        hSort(a);
        System.out.println(a);
    }
    public static void hSort(char a[]) {
        if (a.length <= 1) return;
        buildHeap(a);
        for (int i=a.length - 1; i>0; i--) {
            swap(a, i, 0);
            heapify(a, 0, i - 1);
        }
    }
    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i]= a[j];
        a[j] = t;
    }

    public static void buildHeap(char a[])  {
        for (int i= a.length/2; i>0; i--) {
            heapify(a, i, a.length - 1);
        }
    }

    public static void heapify(char a[], int pos, int  length) {
        int largest = pos;
        int l = pos * 2 + 1;
        int r = pos * 2 + 2;
        if (l<=length && a[largest] < a[l]) {
            largest = l;
        }
        if (r<=length && a[largest] < a[r]) {
            largest = r;
        }
        if (largest != pos) {
            swap(a, pos, largest);
            heapify(a, largest, length);
        }
    }
}
