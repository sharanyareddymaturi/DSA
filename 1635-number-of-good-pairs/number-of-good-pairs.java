// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int ans=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j] && nums[i]<=nums[j]){
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(hm.containsKey(n)){
                ans=ans+hm.get(n);
                hm.put(n,hm.getOrDefault(n,0)+1);
            }else{
                hm.put(n,1);
            }
        }
        return ans;
    }
}