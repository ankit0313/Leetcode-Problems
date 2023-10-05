class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            maxprofit = Math.max(maxprofit,prices[i]-minprice);
            minprice = Math.min(prices[i],minprice);
        }

        return maxprofit;
        
    }
}