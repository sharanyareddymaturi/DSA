class Solution {
    public int maxProfit(int[] prices) {
        //int low=prices[0];
        int profit=0;
        // for(int i=0;i<prices.length-1;i++){
        //     int temp=prices[i]-low;
        //     profit=Math.max(profit,temp);
        //     if(prices[i]<low){
        //         low=prices[i];
        //     }
        // }
         for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}