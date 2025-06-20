import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3 , 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};

        List<Integer> UnionList = getUnion(nums1, nums2);

        System.out.println(UnionList);
    }

    static List<Integer> getUnion(int[] nums1, int[] nums2){
        List<Integer> union = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        int i=0, j=0;

        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            } else {
                if(union.size() == 0 || union.get(union.size() - 1 ) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }

        while(j<m){
            if(union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        return union;
    }

//    static void Union(int nums1[], int nums2[]){
//        Set<Integer> unionSet = new HashSet<>();
//
//        for(int num : nums1){
//            unionSet.add(num);
//        }
//
//        for(int num : nums2){
//            unionSet.add(num);
//        }
//
//        List<Integer> unionList = new ArrayList<>(unionSet);
//
//        System.out.println(unionList);
//
//    }
}
