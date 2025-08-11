class Solution {
    public void rotate(int arr[],int right,int left){
        while(right<left){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            right++;
            left--;
        }
    }
    public boolean check(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            return true;
        }
        rotate(nums,0,index);
        rotate(nums,index+1,n-1);
        rotate(nums,0,n-1);

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}