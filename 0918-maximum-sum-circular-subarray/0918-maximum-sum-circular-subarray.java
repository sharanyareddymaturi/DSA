// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int n=nums.length;
//         int max=nums[0];
//         for(int i=0;i<n;i++){
//             int current_sum=0;
//             for(int j=0;j<n;j++){
//                 int inx=(i+j)%n;
//                 current_sum=current_sum+nums[inx];
//                 max=Math.max(max,current_sum);
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMaxSum = nums[0];
        int currMinSum = nums[0];
        int totalSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            
            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
            minSum = Math.min(minSum, currMinSum);
    
            totalSum += nums[i];
        }
        int circularSum = totalSum - minSum;
        if (circularSum == 0) {
            return maxSum;
        }
        return Math.max(maxSum, circularSum);
    }
}