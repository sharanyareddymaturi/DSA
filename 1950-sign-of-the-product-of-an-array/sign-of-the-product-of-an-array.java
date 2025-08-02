// class Solution {
//     public int product(long n){
//         if(n>0){
//             return 1;
//         }else if(n<0){
//             return -1;
//         }else{
//             return 0;
//         }
//     }
//     public int arraySign(int[] nums) {
//         int n=nums.length;
//         int p=1;
//         int temp=1;
//         for(int i=0;i<n;i++){
//             p=p*nums[i];
//             temp=product(p);
//         }
//         return temp;
//     }
// }

class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sign=sign*-1;
            }else if(nums[i]==0){
                return 0;
            }
        }
        return sign;
    }
}