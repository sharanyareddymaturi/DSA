class Solution {
    public int maximumCount(int[] nums) {
        int count1=0;
        int count2=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            count1++;
        }
        else{
            if(nums[i]<0){
            count2++;
            }
        }
       }
       return (int)Math.max(count1,count2);
    }
}