class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], maxProfit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<=buyPrice){
                buyPrice = prices[i];
            }
            else{
                int diff = prices[i] - buyPrice;
                if(diff > maxProfit){
                    maxProfit = diff;
                }
            }
        }
        return maxProfit;
    }
}
