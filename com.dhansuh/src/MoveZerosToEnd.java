// https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void moveZeroes(int[] nums) {
        int j = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j != -1){
            for(int i=j+1; i< nums.length; i++){
                if(nums[j] != nums[i]){
                    swap(nums, j, i);
                    j++;
                }
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
