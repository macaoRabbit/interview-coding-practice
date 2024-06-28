package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationRotation {
    public static void main(String[] args) {
        String key = "key";
        Map<String, List<String>> m = new HashMap<>();
        List<String> l1 = new ArrayList<>();
        l1.add("a"); l1.add("b"); l1.add("c");
        m.put(key.substring(0, 1), l1);
        List<String> l2 = new ArrayList<>();
        l2.add("1"); l2.add("2"); l2.add("3");
        m.put(key.substring(1, 2), l2);
        List<String> l3 = new ArrayList<>();
        l3.add("x"); l3.add("y"); l3.add("z");
        m.put(key.substring(2, 3), l3);
        List<String> output = new ArrayList<>();
        doRotation(key, m, 0, "", output);
        System.out.println(output);
    }
    public static void doRotation(String key, Map<String, List<String>> m, int index, String soFar, List<String> output) {
        if (index >= key.length()) {
            output.add(soFar);
            return;
        }
        List<String> l = m.get(key.substring(index, index+1));
        for (String s : l) {
            doRotation(key, m, index + 1, soFar + s, output);
        }
    }
}
