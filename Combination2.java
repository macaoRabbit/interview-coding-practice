package practice;

public class Combination2 {
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];
        generateCombination(a, 0);
    }
    public static void generateCombination(int a[], int index) {
        if (a.length <= 0) return;
        if (a.length == index) {
            printA(a);
            return;
        }
        for (int i=0; i<=3; i++) {
            a[index] = i;
            generateCombination(a, index + 1);
        }
    }

    public static void printA(int a[]) {
        for (int i = 0; i< a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
