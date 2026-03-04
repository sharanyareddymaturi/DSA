class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int low=prices[0];
        for(int i=1;i<n;i++){
            int temp=prices[i]-low;
            ans=Math.max(temp,ans);
            if(prices[i]<low){
                low=prices[i];
            }
        }
        return ans;
    }
}


// class Solution {
//     public int maxProfit(int[] prices) {
//        int max=0;
//        int n=prices.length;
//        for(int i=0;i<n;i++){
//         int temp=0;
//         for(int j=i;j<n;j++){
//             if(prices[j]>prices[i]){
//                 temp=prices[i]-prices[j];
//             }
//             max=Math.max(max,Math.abs(temp));
//         }
//        } 
//        return max;
//     }
// }