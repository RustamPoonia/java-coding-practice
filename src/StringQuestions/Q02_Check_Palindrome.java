package StringQuestions;

public class Q02_Check_Palindrome {
    public static void main(String[] args) {
        String str ="aBcdcbaa";
        System.out.println(isPalendrome(str.toLowerCase()));
    }
    public static Boolean isPalendrome(String str){
       int i = 0 ;
       int j=str.length()-1;

       while(i<j){
           if(str.charAt(i++) != str.charAt(j--)){
               return false;
           }
       }
       return true;
    }
}


