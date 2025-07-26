class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int value:nums){
            hs.add(value);
        }
        int lcs=0;
        for(int value:hs){
            if(hs.contains(value-1)){
                continue;
            }else{
                int currnum=value;
                int currsub=1;
                while(hs.contains(currnum+1)){
                    currnum++;
                    currsub++;
                }
                lcs=Math.max(lcs,currsub);
            }
        }
        return lcs;
    }
}