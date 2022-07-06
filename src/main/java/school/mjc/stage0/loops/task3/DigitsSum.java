package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t<0) t = t * -1;
        int sumNumber = 0;
        String tStr = Integer.toString(t);
        for ( int i = 0; i < tStr.length(); i++) {
            sumNumber += Character.getNumericValue((tStr.charAt(i)));
        }
        System.out.println(sumNumber);

    }
}
