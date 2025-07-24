// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement)){
            return new int[] {hm.get(complement),i};
        }
        hm.put(nums[i],i);
        }
        return new int[]{};
    }
}

