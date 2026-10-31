class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int j, k, target, res;
        List<List<Integer>> threeSumResult = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            j = i + 1;
            k = nums.length - 1;
            target = -(nums[i]);
            while (j < k) {
                res = nums[j] + nums[k];
                if (res > target) {
                    k--;
                } else if (res < target) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    Collections.addAll(list, nums[i], nums[j], nums[k]);
                    threeSumResult.add(list);
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return threeSumResult;
    }
}
