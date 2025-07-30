package StringQuestions;

public class Q01_Reverse_a_String {
    public static void main(String[] args) {
        String str = "Rahul";
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse().toString());
    }

}
