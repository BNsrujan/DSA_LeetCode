class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> algo =new HashMap<>();
        StringBuilder srt = new StringBuilder();
        int a = 'a';
        for(char k: key.toCharArray()){
            if(k !=  ' ' && !algo.containsKey(k) ){
                algo.put(k,(char)a);
                a++;
            }
            
            
        } 

        for(char s:message.toCharArray()){
            if(s == ' '){ 
            srt.append(s);
            continue ;
            }
            srt.append(algo.get(s));
        }

        return srt.toString();
    }
}