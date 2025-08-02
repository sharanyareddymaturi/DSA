class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }else if(nums[i]<min){
                min=nums[i];
            }
        }
        int max1=1;
        for(int i=1;i<=max;i++){
            if(min%i==0 && max%i==0){
                if(i>max1){
                    max1=i;
                }
            }
        }
        return max1;
    }
}