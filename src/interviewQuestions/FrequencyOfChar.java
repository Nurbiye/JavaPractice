package interviewQuestions;

public class FrequencyOfChar {
    //write a return method that can find the frequency of characters:

    //"AABBJJDDHHHIII" ==>A2B2J2D2H3I3
  //  str ="AACCSSHHVBBEEEE"

    public static String frequencyOfChar(String str) {
        String nonDup = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) {
                nonDup += str.charAt(i) + "";
            }
        }

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (nonDup.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result += nonDup.charAt(i) + "" + count;
        }
        return result;
    }




    public static void main(String[] args) {
        System.out.println(frequencyOfChar("AAACCCBB"));
    }



}
