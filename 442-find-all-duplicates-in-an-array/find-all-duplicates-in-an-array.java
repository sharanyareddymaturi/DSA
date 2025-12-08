class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int key:hs.keySet()){
            if(hs.get(key)>1){
                result.add(key);
            }
        }
        return result;
    }
}