class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> arr = new HashSet();
            for(int i:nums1){
                for(int j:nums2){
                    if(i == j){
                        arr.add(i);
                    }
                }
            }
            int lengths = arr.size();
            int len[] = new int[lengths];
            int j = 0;
            for(int i:arr){
                len[j]=i;
                j++;
            }
            return len;
    }
}