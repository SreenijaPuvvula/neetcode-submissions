class Solution {
    public int trap(int[] height) {
        int leftM, rightM, minHeight, capacity, currVol;
        leftM = rightM = capacity = 0;

        int i=0, j=height.length-1;

        while(i<=j){
           if(leftM <= rightM){
             currVol = leftM - height[i];
             if(currVol<0){
                leftM = height[i];
             }
             else{
                capacity+=currVol;
             }
             i++;
           }
           else{
             currVol = rightM - height[j];
             if(currVol<0){
                rightM = height[j];
             }
             else{
                capacity+=currVol;
             }
             j--;
           }
        }
        return capacity;
    }
}
