class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] matrix2 = new int[m][n];
        for(int i = 0; i < n ;i++){
            for(int j = 0 ; j< m; j++){  
                matrix2[j][i] = matrix[i][j];
            }
        }
        return matrix2;
    }


}