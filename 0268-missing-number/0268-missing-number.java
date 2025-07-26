// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i){
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=nums[i];
        }
        return sum-ans;
    }
}
