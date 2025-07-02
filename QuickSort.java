import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 4, 6, 8, 2, 1, 9, 0};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pIndex = partition(arr, low, high);

        quickSort(arr, low, pIndex-1);
        quickSort(arr, pIndex+1, high);
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i <= high){
                i++;
            }
            while(arr[j] > pivot && j >= low){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}

// Time Complexity : (nlogn)
// Space Complexity : O(1)
