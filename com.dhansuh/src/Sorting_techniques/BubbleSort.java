package Sorting_techniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] nums = {13, 46, 23, 7, 89, 0};
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

//    static void bubbleSort(int[] arr){
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j< arr.length-i-1; j++){
//                if(arr[j+1] < arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

    static void bubbleSort(int[] arr){
        for(int i= arr.length-1; i>=0; i--){
            boolean swapped = false;
            for(int j=0; j<i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
            System.out.println("runs");
        }
    }
}
