
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> myList = new ArrayList<>();
        if (s.length() < p.length()) return myList;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int window = p.length();
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

            if (Arrays.equals(pCount, sCount)) {
                myList.add(i - window + 1);
            }
        }

        return myList;
    }
}
