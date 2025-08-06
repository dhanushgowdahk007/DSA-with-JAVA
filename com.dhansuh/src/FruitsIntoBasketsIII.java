// https://leetcode.com/problems/fruits-into-baskets-iii/?envType=daily-question&envId=2025-08-06

public class FruitsIntoBasketsIII {

    // --- Segment Tree ---
    static class SegmentTree {
        int[] tree;
        int n;

        SegmentTree(int[] baskets) {
            n = baskets.length;
            tree = new int[4 * n];
            build(baskets, 0, 0, n - 1);
        }

        void build(int[] arr, int index, int start, int end) {
            if (start == end) {
                tree[index] = arr[start];
                return;
            }
            int mid = (start + end) / 2;
            build(arr, 2 * index + 1, start, mid);
            build(arr, 2 * index + 2, mid + 1, end);
            tree[index] = Math.max(tree[2 * index + 1], tree[2 * index + 2]);
        }

        int query(int target) {
            if (tree[0] < target) return -1;  // No basket can hold this fruit
            return queryUtil(0, 0, n - 1, target);
        }

        int queryUtil(int index, int start, int end, int target) {
            if (start == end) return start;
            int mid = (start + end) / 2;
            if (tree[2 * index + 1] >= target)
                return queryUtil(2 * index + 1, start, mid, target);
            else
                return queryUtil(2 * index + 2, mid + 1, end, target);
        }

        void update(int pos, int value) {
            updateUtil(0, 0, n - 1, pos, value);
        }

        void updateUtil(int index, int start, int end, int pos, int value) {
            if (start == end) {
                tree[index] = value;
                return;
            }
            int mid = (start + end) / 2;
            if (pos <= mid)
                updateUtil(2 * index + 1, start, mid, pos, value);
            else
                updateUtil(2 * index + 2, mid + 1, end, pos, value);
            tree[index] = Math.max(tree[2 * index + 1], tree[2 * index + 2]);
        }
    }

    // --- Main Logic ---
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        SegmentTree st = new SegmentTree(baskets);
        int unplaced = 0;

        for (int fruit : fruits) {
            int basketIndex = st.query(fruit);
            if (basketIndex == -1) {
                unplaced++;
            } else {
                st.update(basketIndex, -1);  // Mark basket as used
            }
        }
        return unplaced;
    }

    // --- Test ---
    public static void main(String[] args) {
        FruitsIntoBasketsIII sol = new FruitsIntoBasketsIII();
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        System.out.println(sol.numOfUnplacedFruits(fruits, baskets));  // Expected Output: 1
    }
}
