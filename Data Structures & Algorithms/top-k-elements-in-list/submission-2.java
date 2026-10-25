class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }

       ArrayList<Integer> relatedFreqElementsBucket[] = new ArrayList[nums.length];

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(relatedFreqElementsBucket[entry.getValue()-1]==null){
                relatedFreqElementsBucket[entry.getValue()-1] = new ArrayList<>();
            }
            relatedFreqElementsBucket[entry.getValue()-1].add(entry.getKey());
        }

        System.out.println(relatedFreqElementsBucket.toString());

        int result[] = new int[k];
        int j=0;
        for(int i=nums.length-1; i>=0; i--){
            while(i>=0 && relatedFreqElementsBucket[i]==null){
                i--;
            }
            if(i>=0){
                for(int element: relatedFreqElementsBucket[i]){
                    result[j] = element;
                    j++;
                    if(j==k){
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
