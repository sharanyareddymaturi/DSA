class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int min_sum=0;
        int max_sum=0;
        int maxsum=0;
        int minsum=0;
        int sum=0;
        for(int i=0;i<n;i++){
            max_sum=Math.max(nums[i],max_sum+nums[i]);
            maxsum=Math.max(maxsum,max_sum);
            min_sum=Math.min(nums[i],min_sum+nums[i]);
            minsum=Math.min(minsum,min_sum);
            sum=Math.max(maxsum,Math.abs(minsum));
        }
        return sum;
    }
}

// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int n=nums.length;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             int temp=0;
//             for(int j=i;j<n;j++){
//                 temp+=nums[j];
//                 sum=Math.max(sum,Math.abs(temp));
//             }
//         }
//         return sum;
//     }
// }

// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int sum=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int temp=0;
//                 for(int k=i;k<=j;k++){
//                     temp=temp+nums[k];
//                 }
//                 sum=Math.max(sum,Math.abs(temp));
//             }
//         }
//         return sum;
//     }
// }