package Sorting_techniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {13, 46, 23, 7, 89, 0};
//        System.out.println(Arrays.toString(nums));
//        System.out.println();
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            int min = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
//            System.out.println(arr[min] + " " + arr[i]);
//            System.out.println(Arrays.toString(arr));
//            System.out.println();
        }
    }
}

// Time Complexity O(n^2)
// Space Complexity O(1)