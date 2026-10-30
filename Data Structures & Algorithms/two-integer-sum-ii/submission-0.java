class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, j=nums.length-1;
        int res,diff;
        int ans[] = new int[2];
        while(i<j){
           res = nums[i] + nums[j];
           if(res==target){
             ans[0] = i+1;
             ans[1] = j+1;
             break;
           }
           else if(res > target){
             j--;
           }
           else{
            i++;
           }
        }
        return ans;
    }
}
