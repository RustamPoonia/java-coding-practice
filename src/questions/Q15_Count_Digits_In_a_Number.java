package questions;

public class Q15_Count_Digits_In_a_Number {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(countDigit(number));
    }

    public static int countDigit(int n){
        if(n==0){
            return 1;
        }
        if(n <0){
            n=-n;
        }

        int result = 0;
        while(n!=0){
            n = n/10;
            result ++;
        }
        return result;
    }
}

