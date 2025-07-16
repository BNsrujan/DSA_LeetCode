class Solution {
    public int countGoodSubstrings(String s) {
        
        char[] s1 = s.toCharArray();
        int n = s1.length;
        int count = 0;
        for(int i = 0; i<n-2;i++){
            if(s1[i] != s1[i+1] && s1[i] != s1[i+2] && s1[i+1] != s1[i+2] ){
                    count++;
            }
        }
        return count;
    }
}