// https://leetcode.com/problems/fruits-into-baskets-ii/?envType=daily-question&envId=2025-08-05

public class FruitsIntoBasketsII {
    public static void main(String[] args) {
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unPlaced = 0;
        boolean[] used = new boolean[baskets.length];

        for(int fruit : fruits){
            boolean isPlaced = false;
            for(int j=0; j<baskets.length; j++){
                if(fruit <= baskets[j] && !used[j]){
                    used[j] = true;
                    isPlaced = true;
                    break;
                }
            }

            if(!isPlaced){
                unPlaced += 1;
            }
        }

        return unPlaced;
    }
}
