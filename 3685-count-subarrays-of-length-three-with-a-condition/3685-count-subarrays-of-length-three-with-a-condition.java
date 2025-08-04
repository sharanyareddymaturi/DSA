class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            float a=nums[i];
            float b=nums[i+1];
            float c=nums[i+2];
            if((a+c)==(b/2)){
                count++;
            }
        }
        return count;
    }
}