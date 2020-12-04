package someTopics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        //  list3.set(  list3.size()-1 , 30 );
        System.out.println(list);

        for(int i = 0; i <= list.size()-1; i++){
            Integer each = list.get(i);
            if(each % 2 != 0){
                list.set(i, each * 2);
            }else{
                list.set( i, each*3);
            }

        }


        System.out.println(list);




    }




}

