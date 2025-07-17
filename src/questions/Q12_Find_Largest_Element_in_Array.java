package questions;

public class Q12_Find_Largest_Element_in_Array {
    public static void main(String[] args) {
        int[] arr={1000,45,300,67,8};

        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

}
