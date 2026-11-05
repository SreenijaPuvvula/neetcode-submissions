class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ws=0,we=0,maxLength=0;
        for(int i=0; i<s.length(); i++){
           we=i;
           if(map.containsKey(s.charAt(i))){
             if(map.get(s.charAt(i))>=ws){
                ws = map.get(s.charAt(i))+1;
                map.put(s.charAt(i), i);
             }
           } 
           maxLength = Math.max(maxLength, we-ws+1); 
           map.put(s.charAt(i), i);
        }
        return maxLength;
    }
}
