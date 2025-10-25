class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n=nums.length-1;
        int maxreach=0;
        for(int i=0;i<=maxreach;i++){
            maxreach=Math.max(maxreach,i+nums[i]);

            if(maxreach>=n){
                return true;
            }
        }
        return false;
    }
}