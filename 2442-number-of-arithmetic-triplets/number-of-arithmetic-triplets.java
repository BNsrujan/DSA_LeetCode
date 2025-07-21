class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> list = new HashSet<>();
        for(int i:nums){
            list.add(i);
        }
        for(int i:nums){
            if ((list.contains(i-diff))&&(list.contains(i+diff))) {
                count++;
            }
        }
        return count;
    }
}