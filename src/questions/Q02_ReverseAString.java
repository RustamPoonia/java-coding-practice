package questions;

public class Q02_ReverseAString {
    public static void main(String[] args) {
        String str = "rahul";
        System.out.println(reverse(str));
    }

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
}
