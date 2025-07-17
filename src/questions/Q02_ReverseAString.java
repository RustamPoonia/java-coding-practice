package questions;

public class Q02_ReverseAString {
    public static void main(String[] args) {
        String str = "rahul";
        System.out.println(reverse(str));   // using builtin methods
        System.out.println(reverse1(str));

    }

//    By using Builtin Methods
    public static String reverse(String str){
        if(str==null){
            System.out.println("String is Empty");
        }
        StringBuffer buffer = new StringBuffer();
        char[] chars= str.toCharArray();

        for(int i = chars.length-1;i>=0;i--){
            buffer.append(chars[i]);
        }
        return buffer.toString();
    }

//    Without using builtin Methods
    public static String reverse1(String str){
        if(str == null){
            return "String is null";
        }

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);

        }
        return reverse;
    }


}
