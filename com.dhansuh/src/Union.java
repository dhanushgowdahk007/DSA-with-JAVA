import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3 , 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};

        Union(nums1, nums2);
    }

    static void Union(int nums1[], int nums2[]){
        Set<Integer> unionSet = new HashSet<>();

        for(int num : nums1){
            unionSet.add(num);
        }

        for(int num : nums2){
            unionSet.add(num);
        }

        List<Integer> unionList = new ArrayList<>(unionSet);

        System.out.println(unionList);

    }
}
