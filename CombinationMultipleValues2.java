package practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationMultipleValues2 {
    public static void main(String[] args) {
        char a[][] = {
                {'a', 'b', 'c'},
                {'x', 'y', 'z'},
                {'3', '6', '9'}
        };
        List<String> output = new ArrayList<>();
        doComb(a, 0, 3, "", output);
        System.out.println(output);
    }
    public static void doComb(char a[][], int index, int length, String soFar, List<String> output) {
        if (length <= 0) return;
        if (index >= length) {
            output.add(soFar);
            return;
        }
        for (char t : a[index]) {
            doComb(a, index + 1, length, soFar + t, output);
        }
    }
}
