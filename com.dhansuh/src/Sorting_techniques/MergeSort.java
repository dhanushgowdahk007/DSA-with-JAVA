package Sorting_techniques;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 8 ,2 ,9, 0, 1, 6};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(left);
                left++;
            } else {
                temp.add(right);
                right++;
            }
        }

        while (left<=mid){
            temp.add(left);
            left++;
        }

        while (right <= high){
            temp.add(right);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}

// Time complexity : O(nlogn)
// Space complexity : O(n)
