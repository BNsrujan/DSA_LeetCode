class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        HashMap<Integer ,Integer > map = new HashMap<>();
        int len = grid.length;
        int count = 0;
        for(int i=0 ; i < len ;i++){
              for(int j=0 ; j < len ;j++){
                int val = grid[i][j];
                map.put(val, map.getOrDefault(val, 0) + 1);
              }
        }

        for(int i = 1; i <= len * len  ;i++){
        if( map.getOrDefault(i, 0) == 0){
            ans[1] = i;
        }
        else if( map.getOrDefault(i, 0) == 2){
            ans[0] = i;
        }
        }
        return ans;
    }
}