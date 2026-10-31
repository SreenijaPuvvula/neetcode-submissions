class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int j,k, target, res;
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> threeSumResult = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            j = i+1;
            k = nums.length-1;
            target = -(nums[i]);
            while(j<k){
                res = nums[j]+nums[k];
                if(res>target){
                   k--;
                }
                else if(res<target){
                    j++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    Collections.addAll(list,nums[i],nums[j],nums[k]);
                    Collections.sort(list);
                    if(!set.contains(list)){
                       threeSumResult.add(list);
                    }
                    set.add(list);
                    k--;
                }
            }
        }
        return threeSumResult;
    }
}
