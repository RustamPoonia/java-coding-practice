package questions;

import java.util.Scanner;

public class Q05_Print_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print :");

        int n =sc.nextInt();
        int first = 0;
        int second =1;
        System.out.print(first +",");
        for(int i = 1;i<=n;i++){
            System.out.print(second+",");

            int next = first + second;
            first = second;
            second = next;


        }
    }
}
