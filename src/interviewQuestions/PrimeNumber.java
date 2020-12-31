package interviewQuestions;

import java.util.Arrays;

public class PrimeNumber {
    /*
    * prime number:is the number that is only divisible by itself and 1
    * */
    // What is a prime number:
    // a number that is only divisible by itself and 1

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(10));
        System.out.println(isPrimeNumber(11));
        System.out.println(isPrimeNumber(-13));

        System.out.println();
        printPrimeNumber(100);
    }

    public static boolean isPrimeNumber(int num) {

        if(num < 0) return false;

        for(int i= 2; i < num/2; i++) {
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    // print out all prime numbers up to a number

    public static void printPrimeNumber(int number) {

        for(int i= 2; i < number; i++) {

            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }

    }








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
//    public static void main(String[] args) {
//        String x= "level";
//        String y = "race car";
//        String z= "Madam";
//        System.out.println(isPalindrome1(x));
//        System.out.println(isPalindrome1(y));
//        System.out.println(isPalindrome1(z));
//
//
//
//
//
//
//    }



}
