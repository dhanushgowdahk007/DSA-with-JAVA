// https://leetcode.com/problems/fruit-into-baskets/?envType=daily-question&envId=2025-08-04

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int maxFruit = 0;

        for(int j=0; j<fruits.length; j++){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }
                i++;
            }

            maxFruit = Math.max(maxFruit, j-i+1);
        }

        return maxFruit;
    }
}
