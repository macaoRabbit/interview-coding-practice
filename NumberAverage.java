package practice;

public class NumberAverage {
    public static void main(String[] args) {
        int a[] = {3, 5, 7, 9, 11, 13, 15};
        int k = 3;
        double sum = 0.0;
        for (int i=0; i<k-1; i++) {
            sum += a[i];
        }
        for (int i=0; i<a.length; i++) {
            if (i - 1 >= 0 && i - 2 >= 0) {
                sum = sum + a[i];
                double t = sum/k;
                System.out.print(t + " ");
                sum = sum - a[i - k + 1];
            } else {
                System.out.print(-1 + " ");
            }
        }
        System.out.println();
    }
}
