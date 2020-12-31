package interviewQuestions;

public class SumOfNumbersFromString {
    public static int getSumOfNumbers(String str){
        //"jav45ai15sqre1at82"
        int sum =0 ;
        String num = ""; //
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i) ) ){
                num += str.charAt(i);
                if (i==str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(num);
                    num ="";
                }

            }
        }
        return sum;
    }


}
