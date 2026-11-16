class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int leftMax[] = new int[length];
        int rightMax[] = new int[length];
        leftMax[0] = 0;
        rightMax[length-1] = 0;
        int leftM, rightM, waterCapAtCurrInd;
        leftM = rightM = 0;
        int totalWater=0;
        for(int i=1; i<length; i++){
            leftM = Math.max(leftM, height[i-1]);
            leftMax[i] = leftM;
        }

        for(int j=length-2; j>=0; j--){
           rightM = Math.max(rightM, height[j+1]);
           rightMax[j] = rightM;
        }

        // System.out.println(Arrays.toString(leftMax));
        // System.out.println(Arrays.toString(rightMax));
  
        for(int i=0; i<length; i++){
          waterCapAtCurrInd = (Math.min(leftMax[i],rightMax[i]))-height[i];
          if(waterCapAtCurrInd>0){
            totalWater+= waterCapAtCurrInd;
          }
        }

        return totalWater;
    }
}
