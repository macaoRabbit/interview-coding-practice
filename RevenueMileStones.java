package practice;

public class RevenueMileStones {
    public static void main(String[] args) {
        int daily[] = {10, 20, 30, 40, 40, 20, 30, 10, 50, 70, 55, 45};
        int mileStones[] = {50, 100, 200, 500};
        findDays(daily, mileStones);
    }

    public static void findDays(int daily[], int milestones[]) {
        int mPtr = 0;
        int sum = 0;
        for (int i = 0; i < daily.length; i++) {
            sum += daily[i];
            if (sum >= milestones[mPtr]) {
                System.out.println("Day: " + (i + 1) + "  mileStone:" + milestones[mPtr]);
                mPtr++;
                if (mPtr >= milestones.length) break;
            }
        }
        for (int i = mPtr; i < milestones.length; i++) {
            System.out.println("mileStone not met:" + milestones[mPtr]);
        }
    }
}
