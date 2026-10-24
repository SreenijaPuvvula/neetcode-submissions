class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int i : nums){
          if(hashset.contains(i)){
            return true;
          }
          hashset.add(i);
        }
        
        return false;

    }
}