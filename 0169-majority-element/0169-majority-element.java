class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int n=nums[i];
        hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int ans=-1;
        int num=nums.length/2;
        for(int boon:hm.keySet()){
            if(hm.get(boon)>num){
                ans=boon;
                break;
            }

        }
        return ans;
    }
}