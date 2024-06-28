package practice;

public class CombinationIII {
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];
        doComb(a, 0);
    }

    private static void doComb(int[] a, int pos) {
        if (a.length == 0) return;
        if (a.length == pos) {
            print(a);
            return;
        }
        a[pos] = 0;
        doComb(a, pos + 1);
        a[pos] = 1;
        doComb(a, pos + 1);
    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
