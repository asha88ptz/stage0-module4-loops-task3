package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int nines = 9;
            int sum = nines;
            for (int i = 2; i <= lengthOfLastNumber; i++) {
                nines = nines * 10 + 9;
                sum += nines;
            }
            System.out.println(sum);
        }
    }
}
