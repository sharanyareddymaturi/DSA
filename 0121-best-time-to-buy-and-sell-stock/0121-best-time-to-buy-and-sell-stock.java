class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int low=prices[0];
        for(int i=1;i<n;i++){
            int temp=prices[i]-low;
            max=Math.max(max,temp);
            if(prices[i]<low){
                low=prices[i];
            }
        }
        return max;
    }
}