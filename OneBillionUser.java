package practice;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OneBillionUser {
    public static void main(String[] args) {
        double rate[] = {1.03, 1.06, 1.09, 1.2, 1.025};
        double base = 100.0;
        double user = 1000000000;
        System.out.println("this is the year: " + years(base, rate, user));
    }

    public static int years(double base, double rate[], double user) {
        OptionalDouble maxRate = Arrays.stream(rate).max();
        int smallest = (int) Math.ceil ((Math.log(user) - Math.log(base))/Math.log(maxRate.getAsDouble()));
        double users  = 0.0;
        int thisYear = 0;
        do {
            users  = 0.0;
            for (double d : rate) {
                users += base * Math.pow(d, smallest);
            }
            if (users > user) {
                thisYear = smallest;
            }
            smallest--;
        } while (users > user);
        return thisYear;
    }
}
