package questions;

import java.sql.SQLOutput;

public class Q14_find_largest_and_smallest_number_in_Array {
    public static void main(String[] args) {
        int[] arr = {2,4,6,23,12,7,98};
        findLargest(arr);
        smallest(arr);

    }
    public static void findLargest(int[] arr){
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("the largest number in the array is :"+largest);
    }

    public static void smallest(int[] arr){
        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println("the largest number in the array is :"+smallest);
    }
}
