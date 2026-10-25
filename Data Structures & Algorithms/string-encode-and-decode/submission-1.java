class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> decodedStrings = new ArrayList<>();
       int i=0,count, currentLength;
       StringBuilder tempLength;
       StringBuilder currentString;
       while(i<str.length()){
        currentLength=0;
        tempLength = new StringBuilder();
        while(str.charAt(i)!='#'){
           tempLength.append(str.charAt(i));
           i++;
        }
        currentLength = Integer.valueOf(tempLength.toString());
        i++;
        count = 0;
        currentString = new StringBuilder();
        while(count < currentLength){
           currentString.append(str.charAt(i));
           i++;
           count++;
        }
        decodedStrings.add(currentString.toString());
       }
       return decodedStrings;
    }
}
