class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num:hm.keySet()){
           if(k>0 && hm.containsKey(num+k)){
            count++; 
           }
           if(k==0 && hm.get(num)>1){
            count++;
           }
        }
        return count;
    }
}