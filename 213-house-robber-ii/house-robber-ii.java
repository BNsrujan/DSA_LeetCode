class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);

        return Math.max(robrange(nums,0,n-1) , robrange(nums,1,n));
    }

    public int robrange(int[] nums, int start, int end){
        int a = 0;
        int b = 0;
        int max = 0;

        for(int i = start; i < end; i++){
            max = Math.max(a,b + nums[i]);

            b = a;
            a = max;

        }

        return a;
    }
}