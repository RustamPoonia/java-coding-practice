package StringQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q04_Chech_if_two_Strings_Anagrams {
    public static void main(String[] args) {
        String str = "ramu";
        String str1 ="tmra";

        System.out.println(areAnagrams(str,str1));
    }
    public static boolean areAnagrams(String s1,String s2){
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}
