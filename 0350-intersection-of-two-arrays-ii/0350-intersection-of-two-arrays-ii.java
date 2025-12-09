class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hs1.put(nums1[i],hs1.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hs1.containsKey(nums2[i]) && hs1.get(nums2[i])>0){
                list.add(nums2[i]);
                hs1.put(nums2[i],hs1.get(nums2[i])-1);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}