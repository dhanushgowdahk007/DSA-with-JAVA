package Sorting_techniques;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {13, 46, 23, 7, 89, 0};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
}
