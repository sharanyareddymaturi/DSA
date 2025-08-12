// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int val=nums[i];
//             if(hm.containsKey(val) && i-hm.get(val) <= k){
//                 return true;
//             }
//             hm.put(val,i);
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     int temp=Math.abs(j-i);
//                     if(temp<=k){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && (j - i) <= k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
