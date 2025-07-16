package questions;

public class Q04_Check_Vovles_In_String {
    public static void main(String[] args) {
        System.out.println(stringContainsVovels("Hello"));
        System.out.println(stringContainsVovels("TV"));
    }

    public static boolean stringContainsVovels(String str){
        return str.toLowerCase().matches(".*[aeiou].*");

    }

}
