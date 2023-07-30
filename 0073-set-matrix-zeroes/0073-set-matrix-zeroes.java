class Solution {
    private void markRow(int[][] arr, int i, int m) {
        for(int j = 0; j < m; j++) {
            if(arr[i][j] != 0) {
                arr[i][j] = -10;
            }
        }
    }
    private void markCol(int[][] arr, int j, int n) {
        for(int i = 0; i < n; i++) {
            if(arr[i][j] != 0) {
                arr[i][j] = -10;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++) {
           for(int j = 0; j < m; j++) {
               if(matrix[i][j] == 0) {
                   markRow(matrix, i, m);
                   markCol(matrix, j, n);
               }
           } 
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -10) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}