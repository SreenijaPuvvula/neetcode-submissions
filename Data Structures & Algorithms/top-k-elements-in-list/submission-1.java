class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }

        ArrayList<Map.Entry<Integer, Integer> > sortedList = new ArrayList<>(freqMap.entrySet());

        Comparator<Map.Entry<Integer, Integer>> comp = (a,b) -> {
            return b.getValue().compareTo(a.getValue());
        };

        Collections.sort(sortedList, comp);
        
        int result[] = new int[k];

        for(int i=0; i<k; i++){
            result[i] = sortedList.get(i).getKey();
        }

        return result;
    }
}
