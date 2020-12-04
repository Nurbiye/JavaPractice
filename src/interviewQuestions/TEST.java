package interviewQuestions;

import java.util.Arrays;

public class TEST {
//    public static void main(String[] args) { //
//String[] str = {"a","a","b","b","r","t","t"};

 //   }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(appearsTwice("java", "I like java, java is fun!") );

//
//        String a= "I like java, java is fun!";
//        String[] arr=a.replace(",","").replace(".","").replace("!","").split(" ");
//        System.out.println(Arrays.toString(arr));

        System.out.println(validateTask(true,5,2) );
    }

    /*
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        String[] arr=sentence.replace(",","").replace(".","").replace("!","").split(" ");
        int count=0;
        for(String each: arr){
            if(each.equals(target) ){
                count+=1;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {

        return notEmpty && taskId == currentId +1;

    }



}
