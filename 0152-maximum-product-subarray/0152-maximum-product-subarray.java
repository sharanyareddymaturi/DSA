class Solution {
    public int maxProduct(int[] nums) {
        int maxp=nums[0];
        int res=nums[0];
        int minp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxp;
                maxp=minp;
                minp=temp;

            }
            maxp=Math.max(nums[i],nums[i]*maxp);
            minp=Math.min(nums[i],nums[i]*minp);
            res=Math.max(res,maxp);
            
        }
        return res;
    }
}