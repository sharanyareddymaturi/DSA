class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}



// class Solution { it does not work beacuse testcases may contain -ve values
//sliding window does not works for -ve values
//     public int subarraySum(int[] nums, int k) {
//         int l=0;
//         int n=nums.length;
//         int temp=0;
//         int count=0;

//         for(int r=0;r<n;r++){
//             temp+=nums[r];
//             while(temp>k){
//                 temp-=nums[l];
//                 l++;
//             }
//              if(temp==k){
//                 count++;
//             }
//         }
//         return count;
//     }
// }