package practice;

public class Permutation2 {
    public static void main(String[] args) {
        char a[] = "abc".toCharArray();
        permute(a, 0);
    }

    public static void permute(char a[], int index) {
        if (index == a.length) {
            System.out.println(a);
            return;
        }
        for (int i = index; i < a.length; i++) {
            swap(a, index, i);
            permute(a, index + 1);
            swap(a, index, i);
        }
    }

    public static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
