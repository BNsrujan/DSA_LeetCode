class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] ran = new int[26];

        for(char c:magazine.toCharArray()){
            ran[c - 'a']++;
        } 

        for(char c:ransomNote.toCharArray()){
            if(ran[c - 'a'] == 0  ){
                return false;
            }

            ran[c - 'a']--;
        }

        return true;
    }
}