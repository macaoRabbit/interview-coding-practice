package practice;

public class CombinationMultiipleValue1 {
    public static void main(String[] args) {
        int n = 3;
        char a[][] = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'x', 'y', 'z'}
        };
        doRotation(a, n, 0, "");
    }
    public static void doRotation(char a[][], int n, int index, String current) {
        if (index == n) {
            System.out.println(current);
            return;
        }
        for (int i=0; i<a[index].length; i++) {
            doRotation(a, n, index + 1, current + a[index][i]);
        }
    }
}
