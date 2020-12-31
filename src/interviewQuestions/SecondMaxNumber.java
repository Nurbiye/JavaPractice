package interviewQuestions;

public class SecondMaxNumber {
    /*
    * [3,5,1,4,12,4,1,8,12]
    * max:12
    * second max: 8
    * */

    public static int getSecondMaxNumber(int[] arr) {
        // ... this is var args--variable arguments
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int eachNum : arr) {

            if (eachNum > max) {
                second = max;
                max = eachNum;
            }
            if (eachNum > second && eachNum < max) {
                second = eachNum;
            }
        }
return second;

    }
}
