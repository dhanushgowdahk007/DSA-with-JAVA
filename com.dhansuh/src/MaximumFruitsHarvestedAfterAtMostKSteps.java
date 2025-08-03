public class MaximumFruitsHarvestedAfterAtMostKSteps {
    public static void main(String[] args) {
        int[][] fruits = {{2,8},{6,3},{8,6}};
        int startPos = 5, k=4;

        System.out.println(maxTotalFruits(fruits, startPos, k));;
    }

    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int ans = 0;
        int curr = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            curr += fruits[right][1];

            while (left <= right && stepsNeeded(fruits[left][0], fruits[right][0], startPos) > k) {
                curr -= fruits[left][1];
                left++;
            }

            ans = Math.max(ans, curr);
        }
        return ans;
    }

    private static int stepsNeeded(int leftPos, int rightPos, int startPos) {

        int dist = rightPos - leftPos;

        int extra = Math.min(Math.abs(startPos - leftPos), Math.abs(startPos - rightPos));

        return dist + extra;
    }
}
