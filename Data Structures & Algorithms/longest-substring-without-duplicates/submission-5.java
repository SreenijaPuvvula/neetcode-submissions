class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ws=0,we=0,maxLength=0;
        for(int i=0; i<s.length(); i++){
           we=i;
           //checking if character already exist 
           if(map.containsKey(s.charAt(i))){
             //checking if character is from current window or prev window
             //if it is from prev window, we won't consider it
             //and update the character index in map
             //if it is from current window, we update the window starting point(ws)
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
