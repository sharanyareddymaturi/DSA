// class Solution {
//     public long countBadPairs(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(j-i!=nums[j]-nums[i]){
//                 count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        long goodPairs=0;
        for(int i=0;i<n;i++){
            int key=nums[i]-i;
            goodPairs+=hm.getOrDefault(key,0);
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        long totalparis=(long)n*(n-1)/2;
        return totalparis-goodPairs;
    }
}