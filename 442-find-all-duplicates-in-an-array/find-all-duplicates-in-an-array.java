class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i = 1; i <= n;i++){
            if(map.getOrDefault(i,0) == 2){
                list.add(i);
            }
        }

        return list;
    }
}