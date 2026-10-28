class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        int longestSequence = 0;
        int count = 0;

        for(int n: nums){
            hashset.add(n);
        }

        for(int n: nums){
            count = 1;
            if(!hashset.contains(n-1)){
                int temp = n+1;
                while(hashset.contains(temp)){
                    count++;
                    temp = temp+1;
                }
                longestSequence = Math.max(longestSequence, count);
            }
        }

        return longestSequence;
    }
}
