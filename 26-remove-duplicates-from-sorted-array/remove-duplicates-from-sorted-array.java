class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int k = 0;
        for(int i = 0; i < nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}