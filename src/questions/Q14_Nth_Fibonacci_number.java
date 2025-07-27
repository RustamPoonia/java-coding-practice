package questions;

import java.util.Scanner;

public class Q14_Nth_Fibonacci_number {
    public static void main(String[] args) {
        System.out.println("Inter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a=0;
        int b=1;

        if(num<0){
            System.out.println("Number cannot be Negative");
        }
        else if(num == 0){
            System.out.println(a);
        } else if (num == 1) {
            System.out.println(b);
        }
        else{
            int sum = 0;
            for(int i =2;i<=num;i++){
                sum = a+b;
                a=b;
                b=sum;
            }
            System.out.println(sum);
        }
    }
}
