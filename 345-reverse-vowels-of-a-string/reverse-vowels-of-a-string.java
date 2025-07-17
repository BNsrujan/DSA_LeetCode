
class Solution {
    public String reverseVowels(String s) {
        char[] s1 = s.toCharArray();
        Character[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> vowelsList = Arrays.asList(arr);

        int right = 0;
        int left = s1.length - 1;

        while (right < left) {
            if (vowelsList.contains(s1[right]) && vowelsList.contains(s1[left])) {
                char tmp = s1[right];
                s1[right] = s1[left];
                s1[left] = tmp;
                right++;
                left--;
            } 
            else if (vowelsList.contains(s1[right])) {
                left--;
            } 
            else if (vowelsList.contains(s1[left])) {
                right++;
            } 
            else {
                right++;
                left--;
            }
        }

        return new String(s1);
    }
}
