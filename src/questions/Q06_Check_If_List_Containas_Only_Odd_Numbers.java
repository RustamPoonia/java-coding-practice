package questions;

import java.util.ArrayList;
import java.util.List;

public class Q06_Check_If_List_Containas_Only_Odd_Numbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(1);

        System.out.println(isOdd(list));

    }

    public static boolean isOdd(List<Integer> list){
        for(int i: list){
            if(i % 2 == 0){
                return false;
            }
        }
        return true;

    }
}
