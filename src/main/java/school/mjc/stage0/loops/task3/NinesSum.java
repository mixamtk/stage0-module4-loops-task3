package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sumNumber = 0;
        int p = 0;
        for ( int i = 0; i < lengthOfLastNumber ; i++) {
            p = p*10 + 9;
            sumNumber += p;
            System.out.println((p));
        }
        System.out.println(sumNumber);

    }
}
