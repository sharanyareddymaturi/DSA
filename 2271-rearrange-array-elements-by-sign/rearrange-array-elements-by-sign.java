class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even=0;
        int odd=1;
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                res[even]=nums[i];
                even=even+2;
            }else{
                res[odd]=nums[i];
                odd=odd+2;
            }
        }
        return res;
    }
}