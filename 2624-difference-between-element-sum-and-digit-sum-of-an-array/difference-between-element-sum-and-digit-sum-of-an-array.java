class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        //int result=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            while(nums[i]!=0){
                int digit=nums[i]%10;
                sum1=sum1+digit;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sum-sum1);
    }
}