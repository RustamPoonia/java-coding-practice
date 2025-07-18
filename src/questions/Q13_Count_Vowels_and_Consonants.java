package questions;

public class Q13_Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        String str="Ramu is a good boy";

        char[] charArr=str.toLowerCase().toCharArray();

        int vowels = 0;
        int consonants =0;

        for(int i=0;i<str.length();i++){
           char ch =str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels ++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels :"+vowels+" Consonants :"+consonants);
    }
}
