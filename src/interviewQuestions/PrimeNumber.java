package interviewQuestions;

import java.util.Arrays;

public class PrimeNumber {
//    public static boolean checkPrime(){
//        return a;
//    }



//    public static boolean isPalindrome(String str){
//        if(str==null){
//            return false;
//        }
//
//        StringBuilder sb = new StringBuilder(str);
//
//        return sb.reverse().toString().equalsIgnoreCase(str);
//
//    }

    public static boolean isPalindrome1(String str){
        String[] a = str.replace(" ","").toLowerCase().split("");
        String[] b = new String[a.length];

        for(int i=a.length-1; i>=0; i--){
            b[i] = a[a.length-1-i];
        }

        return Arrays.equals(a,b);



    }
    public static void main(String[] args) {
        String x= "level";
        String y = "race car";
        String z= "Madam";
        System.out.println(isPalindrome1(x));
        System.out.println(isPalindrome1(y));
        System.out.println(isPalindrome1(z));






    }



}
