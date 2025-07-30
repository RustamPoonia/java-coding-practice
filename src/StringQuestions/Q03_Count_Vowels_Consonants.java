package StringQuestions;

public class Q03_Count_Vowels_Consonants {
    public static void main(String[] args) {
        String str= "Ramuparkash";
        countVowelsConsonents(str.toLowerCase());
    }

    public static void  countVowelsConsonents(String str){
        int vowels =0 , consonants = 0;
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c) != -1){
                    vowels ++;
                }
                else {
                    consonants ++;
                }
            }
        }
        System.out.println("Number of vowels :"+vowels+" || Number of Consonants :"+consonants);
    }
}
