package StringQuestions;

public class Q05_Prove_String_Immutabality {
    public static void main(String[] args) {
        String s1="Rahul Roy";
        String s2=s1;
        System.out.println(s1 == s2);

        s1 = s1+"Raman";
        System.out.println(s1 == s2); //New String object is created and s1 is now ponting to new object

    }
}
