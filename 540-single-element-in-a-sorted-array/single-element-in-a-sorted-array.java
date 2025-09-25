// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         HashMap<Integer,Integer> hs=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
//         }
//         for(int key:hs.keySet()){
//             if(hs.get(key)==1){
//                 return key;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }

        return nums[l]; 
    }
}
