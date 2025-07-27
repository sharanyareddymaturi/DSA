class Solution {
    public int findShortestSubArray(int[] nums) {
            int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int degree=0;
        
        HashMap<Integer,Integer> first_seen=new HashMap<>();
        int min_length=0;
        
        for(int i=0;i<n;i++){
            first_seen.putIfAbsent(nums[i],i);

            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            if(hm.get(nums[i])>degree){
                degree=hm.get(nums[i]);
                min_length=i-first_seen.get(nums[i])+1;

            }else if(hm.get(nums[i])==degree){
                min_length=Math.min(min_length,i-first_seen.get(nums[i])+1);
            }
        }
        return min_length;
    }
}