package practice;

public class Test {
    public static void main(String[] args) {
        String s = "This is it";
        System.out.println(s.substring(s.length() - 1, s.length()));
        Integer a = 0;
        int n = 3;
        doAdd(a, n);
        System.out.println(a+n);
    }

    private static void doAdd(Integer a, int n) {
        a = a+n;
    }
}
