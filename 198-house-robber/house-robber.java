class Solution {
    public int rob(int[] nums) {
        if( nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);

        int a = 0;
        int b = 0;
        int max = 0;

       for(int i = 0;i<nums.length;i++){
        max = Math.max(a,b + nums[i]); 

        b = a;
       a = max;
       }

        
       
        return a;

    }
}