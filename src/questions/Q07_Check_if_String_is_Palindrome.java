package questions;

public class Q07_Check_if_String_is_Palindrome {
    public static void main(String[] args) {
        String str = "Abcdcba";
        System.out.println(isPalindrome(str.toLowerCase()));
    }
    public static boolean isPalindrome(String string){
        int length = string.length()-1;
        boolean result =true;
        for(int i=0;i<=length/2;i++){
            if(string.charAt(i) != string.charAt(length-i)){
                result = false;
                break;
            }
        }
        return result;
    }
}
