package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int dig;
        int sum = 0;
        if (t < 0) t = -t;
        while(t > 0) {
            sum += t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
