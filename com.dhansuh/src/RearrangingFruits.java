import java.util.*;

public class RearrangingFruits {
    public static void main(String[] args) {
        int[] basket1 = {2,3,4,1};
        int[] basket2 = {3,2,5,1};

        System.out.println(minCost(basket1, basket2));
    }

    public static long minCost(int[] basket1, int[] basket2) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int fruit : basket1){
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);
        }

        for(int fruit : basket2){
            freq.put(fruit, freq.getOrDefault(fruit, 0) - 1);
        }

        List<Integer> excessBasket1 = new ArrayList<>();
        List<Integer> excessBasket2 = new ArrayList<>();
        int minFruit = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int fruit = entry.getKey();
            int diff = entry.getValue();

            if(diff % 2 != 0){
                return -1;
            }

            minFruit = Math.min(minFruit, fruit);

            int count = Math.abs(diff)/2;

            for(int i=0; i<count; i++){
                if(diff > 0){
                    excessBasket1.add(fruit);
                } else {
                    excessBasket2.add(fruit);
                }
            }
        }

        Collections.sort(excessBasket1);
        excessBasket2.sort(Collections.reverseOrder());

        long cost = 0;

        for(int i=0; i<excessBasket1.size(); i++){
            int fruit1 = excessBasket1.get(i);
            int fruit2 = excessBasket2.get(i);

            cost += Math.min(Math.min(fruit1, fruit2), 2 * minFruit);
        }

        return cost;
    }
}
