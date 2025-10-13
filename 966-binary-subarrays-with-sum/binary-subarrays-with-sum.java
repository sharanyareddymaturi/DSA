class Solution {
    public int atmost(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int l=0;
        int sum=0;
        int ans=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>k && l<n){
                sum-=nums[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
}