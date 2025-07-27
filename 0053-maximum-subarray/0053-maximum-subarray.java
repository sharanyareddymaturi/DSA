// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int sum=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int temp=0;
//                 for(int k=i;k<=j;k++){
//                     temp=temp+nums[k];
//                 }
//                 sum=Math.max(sum,temp);
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
