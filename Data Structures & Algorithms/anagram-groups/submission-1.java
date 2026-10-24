class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashmap = new HashMap<>();
        List<List<String>> groupAnagrams = new ArrayList<>();
        String temp;
        for(String str: strs){
           char arr[] = str.toCharArray();
           Arrays.sort(arr);
           temp = Arrays.toString(arr);
           hashmap.putIfAbsent(temp, new ArrayList<>());
           hashmap.get(temp).add(str);
        }
        
        // for(List<String> list: hashmap.values()){
        //     groupAnagrams.add(list);
        // }

        // return groupAnagrams;
        return new ArrayList<>(hashmap.values());
    }
}

