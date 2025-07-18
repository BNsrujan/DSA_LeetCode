class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        
        int left = 0;
        int right = collen - 1;
        int top = 0;
        int bottom = rowlen - 1;

        while (left <= right && top <= bottom) {

            for (int col = left; col <= right; col++) {
                list.add(matrix[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                list.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }

        return list;
    }
}
