package practice;

public class Median {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 11, 13, 15, 16, 14, 12, 10, 8, 6, 4, 2};
        printA(a);
        getMedian(a);
    }

    public static double[] getMedian(int a[]) {
        double m[] = new double[a.length];
        int smallHeap[] = new int[a.length];
        int smallSize = 0;
        int largeHeap[] = new int[a.length];
        int largeSize = 0;

        for (int i=0; i<a.length; i++) {
            if (smallSize==0 || a[i] > smallHeap[0]) {
                smallHeap[smallSize++] = a[i];
                maxHeapify(smallHeap, smallSize);
            } else {
                largeHeap[largeSize++] = a[i];
                minHeapify(smallHeap, smallSize);
            }
            if (largeSize > smallSize) {
               smallHeap[smallSize++] = largeHeap[0];
                maxHeapify(smallHeap, smallSize);
            }
            if (smallSize==largeSize) {
                m[i] = 0.5 * (smallHeap[0] + largeHeap[0]);
            } else {
                m[i] = smallHeap[0];
            }
        }
        return m;
    }

    private static void minHeapify(int[] smallHeap, int smallSize) {
    }

    private static void maxHeapify(int[] smallHeap, int smallSize) {
    }

    public static void printA(int a[]) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
