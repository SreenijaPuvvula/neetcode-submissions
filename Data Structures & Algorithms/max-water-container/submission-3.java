class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int width, height, maxArea=0;

        while(i<j){
           width = j-i;
           height = Math.min(heights[i], heights[j]);
           maxArea = Math.max(maxArea, width*height);
           
           if(heights[i] < heights[j]){
             i++;
           }
           else{
             j--;
           }
        }
        return maxArea;
    }
}
