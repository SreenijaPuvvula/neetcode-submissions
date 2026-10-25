class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           freqCount.put(nums[i], freqCount.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
           (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())
        );

        for(Map.Entry<Integer, Integer> entry: freqCount.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int topKFreq[] = new int[k];
        Map.Entry<Integer, Integer> temp;
        for(int i=0; i<k; i++){
           temp = pq.poll();
           topKFreq[i] = temp.getKey();
        }

        return topKFreq;
    }
}
