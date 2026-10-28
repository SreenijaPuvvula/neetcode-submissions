class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int longestSequence = 1;

        for(int i=1; i<nums.length; i++){
           if(nums[i-1]+1==nums[i]){
              count++;
           }
           else if(nums[i-1] == nums[i]){
              continue;
           }
           else{
              longestSequence = Math.max(longestSequence, count);
              count = 1;
           }
        }
        longestSequence = Math.max(longestSequence, count);


        return longestSequence;
    }
}
