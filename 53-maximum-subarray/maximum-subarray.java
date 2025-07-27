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
        int maxSum = nums[0]; // Start with nums[0] instead of Integer.MIN_VALUE

        for (int i = 1; i < nums.length; i++) {
            // Either start a new subarray or extend the existing one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

