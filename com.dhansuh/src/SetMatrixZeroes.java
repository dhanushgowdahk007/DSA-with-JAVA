// https://leetcode.com/problems/set-matrix-zeroes/description/

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] col = new int[m];
        int[] row = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
