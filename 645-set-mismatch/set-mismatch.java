// class Solution {
//     public int[] findErrorNums(int[] nums) {
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        int missing=-1;
//        int duplicate=-1;
//        for(int i=0;i<nums.length;i++){
//         hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
//        } 
//        for(int i=1;i<=nums.length;i++){
//         if(!hm.containsKey(i)){
//             missing=i;
//         }
//         else if(hm.get(i)==2){
//             duplicate=i;
//         }
//        }
//        return new int[]{duplicate,missing};
//     }
// }

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int duplicate=-1;
        int missing=-1;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }else{
                duplicate=nums[i];
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }
}