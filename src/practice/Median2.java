package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Median2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 13, 12, 9, 8};
        print(a);
        System.out.println(getMedian(a));
    }

    public static List<Double> getMedian(int a[]) {
        List<Integer> smallHalf = new ArrayList<>();
        List<Integer> largeHalf = new ArrayList<>();
        List<Double> median = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (smallHalf.size() == 0 || a[i] < smallHalf.get(smallHalf.size() - 1)) {
                smallHalf.add(a[i]);
                Collections.sort(smallHalf);
            } else {
                largeHalf.add(a[i]);
                Collections.sort(largeHalf);
            }
            if (smallHalf.size() < largeHalf.size()) {
                smallHalf.add(largeHalf.get(0));
                largeHalf.remove(0);
            }
            if (smallHalf.size() > largeHalf.size()) {
                median.add(Double.valueOf(smallHalf.get(smallHalf.size() - 1)));
            } else {
                median.add( 0.5 * smallHalf.get(smallHalf.size() - 1) +  0.5 * largeHalf.get(0));
            }
        }
        return median.stream().collect(Collectors.toList());
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("-");
        }
        System.out.println();
    }
}
