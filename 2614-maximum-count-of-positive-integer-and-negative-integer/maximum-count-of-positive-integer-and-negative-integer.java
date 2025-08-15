// class Solution {
//     public int maximumCount(int[] nums) {
//         int count1=0;
//         int count2=0;
//        for(int i=0;i<nums.length;i++){
//         if(nums[i]>0){
//             count1++;
//         }
//         else{
//             if(nums[i]<0){
//             count2++;
//             }
//         }
//        }
//        return (int)Math.max(count1,count2);
//     }
// }

class Solution {
    public int leftmost(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        int neg=leftmost(nums,0);
        int one=leftmost(nums,1);
        int pos=nums.length-one;
        return Math.max(neg,pos);
    }
}