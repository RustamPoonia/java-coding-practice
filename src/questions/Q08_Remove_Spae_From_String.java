package questions;

public class Q08_Remove_Spae_From_String {
    public static void main(String[] args) {
        String str = "abst t y";
        System.out.println("String with spaces: "+str);
        System.out.println("String without space: "+removeSpace(str));
    }

    public static String removeSpace(String str){
        StringBuffer buffer = new StringBuffer();

        char[] charArr = str.toCharArray();

        for(char c:charArr){
            if(!Character.isWhitespace(c)){
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
