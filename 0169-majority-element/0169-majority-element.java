class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<n;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int key:hs.keySet()){
            int value=hs.get(key);
            if(value>n/2){
                return key;
            }
        }
        return -1;
    }
}