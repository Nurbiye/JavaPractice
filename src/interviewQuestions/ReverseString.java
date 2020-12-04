package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

//
//    public static String reverseString(String str){
//        String sr = "";
//        for(int i=str.length()-1; i>=0; i-- ){
//            sr += str.charAt(i);
//        }
//        return sr;
//    }
//
//
//    public static void main(String[] args){
//
//        System.out.println(reverseString("Java"));
//
//    }


//    public static void reverseString(String str){
//        String sr = "";
//        for(int i=str.length()-1; i>=0; i-- ){
//            sr += str.charAt(i);
//        }
//        System.out.println(sr);;
//    }
//
//
//    public static void main(String[] args){
//
//        reverseString("Sevda");
//    }



    public static void main(String[] args){
//        String a = "Java";
//        String a1 = new StringBuilder(a).reverse().toString();
//        System.out.println(a1);

        String s= "Geeks for Geeks";

        char[] ch = s.toCharArray();

        List<Character> list = new ArrayList<>();
        for(char each : ch ) {
            list.add(each);
        }
        String reverse ="";

        Collections.reverse(list);

        Object[] ob = list.toArray();

        for(int i = 0; i<=ob.length-1; i++ ){
            reverse += ob[i];
        }

        System.out.println(reverse);






    }




    }



