package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        long sum = 0;
        for(int num = firstBoarder; num <= secondBoarder; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
