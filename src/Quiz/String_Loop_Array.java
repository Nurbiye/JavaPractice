package Quiz;

public class String_Loop_Array {
    public static void main(String[] args) {
        // Q5
        String s="fgf fgg";
        int c=s.charAt(3);  //but why it is int that data type?
        if (c=='a'){
            System.out.println("A");
        }else if (c==' '){
            System.out.println("B");
        }else{
            System.out.println("C");
        }

        s.toUpperCase();
        System.out.println(s);

        //Q8
        String s1="the game was tied at 2-2";
        String s2=s.substring(5);
        int index1=s1.indexOf("game");
        int index2=s2.indexOf("game");
        if (index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
            //the result is -1, we were told about this, if the char not in that string..
        }

        //Q9
//        String z="popcorn";
//       z=z.substring(1,8);
//        System.out.println(z);
//        if (z.equals("opcor")){
//            System.out.println(z.length());
//        }else{
//            System.out.println(z.replace("o,","a"));
//        }

        //Q14
        int a=0;
        do{
            a=a++ + --a -(a%3);
        }while(++a <4);
        System.out.println(a);


        //Q16

        //Q17

        //Q19

        //Q20   ?

        //Q24

        //Q26

        //Q27

        //Q28

        //Q29

        //Q30














    }
}
