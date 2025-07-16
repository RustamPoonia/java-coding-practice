package questions;

public class Q03_Swap2NumberswithoutTemp {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("Value of a:"+a+" and b:"+b+" before Swap");
          b=a+b;
          a=b-a;
          b=b-a;
        System.out.println("Value of a:"+a+" and b:"+b+" after Swap");

    }

}
