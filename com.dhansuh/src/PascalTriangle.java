import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        // Element at 5th row, 3rd column in Pascal's Triangle
        System.out.println("nCr(5, 3) = " + nCr(5, 3));

        // Full row at index 6
        System.out.println("Row 6: " + getRow(6));

        // Full Pascal's Triangle up to 6 rows
        System.out.println("Pascal's Triangle (6 rows):");
        List<List<Integer>> triangle = generate(6);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    // Returns nCr value (1-based row and column)
    static int nCr(int row, int col) {
        int res = 1;
        row = row - 1;
        col = col - 1;

        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }

        return res;
    }

    // Returns a specific row of Pascal's Triangle (1-based index)
    static List<Integer> getRow(int row) {
        int val = 1;
        List<Integer> res = new ArrayList<>();
        res.add(val);

        for (int col = 1; col < row; col++) {
            val = val * (row - col);
            val = val / col;
            res.add(val);
        }

        return res;
    }

    // Returns the full Pascal's Triangle with numRows rows
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            triangle.add(getRow(i));
        }

        return triangle;
    }
}
