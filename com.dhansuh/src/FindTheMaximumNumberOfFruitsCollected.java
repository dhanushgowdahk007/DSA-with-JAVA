public class FindTheMaximumNumberOfFruitsCollected {
    public static void main(String[] args) {
        int[][] fruits = {{1,2,3,4},{5,6,8,7},{9,10,11,12},{13,14,15,16}};
        System.out.println(maxCollectedFruits(fruits));
    }

    public static int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        int maxFruits = 0;
        for (int i = 0; i < n; i++) {
            maxFruits += fruits[i][i];
        }

        maxFruits += getMaxFruits(fruits, n);

        transpose(fruits, n);

        maxFruits += getMaxFruits(fruits, n);

        return maxFruits;
    }

    private static void transpose(int[][] fruits, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = fruits[i][j];
                fruits[i][j] = fruits[j][i];
                fruits[j][i] = temp;
            }
        }
    }

    private static int getMaxFruits(int[][] fruits, int n) {
        int[] prev = new int[n];

        for (int i = 0; i < n; i++) {
            prev[i] = i != n - 1 ? Integer.MIN_VALUE : fruits[0][n-1];
        }

        for (int row = 1; row < n - 1; row++) {
            int[] curr = new int[n];

            for (int i = 0; i < n; i++) {
                curr[i] = Integer.MIN_VALUE;
            }

            for (int col = 0; col < n; col++) {
                int maxValue = Integer.MIN_VALUE;

                if ((col - 1) >= 0) {
                    maxValue = Math.max(maxValue, prev[col - 1]);
                }

                maxValue = Math.max(maxValue, prev[col]);

                if ((col + 1) < n) {
                    maxValue = Math.max(maxValue, prev[col + 1]);
                }

                if (maxValue != Integer.MIN_VALUE) {
                    curr[col] = maxValue + fruits[row][col];
                }
            }

            int[] temp = prev;
            prev = curr;
            curr = prev;
        }

        return prev[n - 1];
    }
}
