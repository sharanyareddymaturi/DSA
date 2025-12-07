class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.remove(num); 
            }
        }    
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashMap<Integer,Integer>hs1=new HashMap<>();
//         HashMap<Integer,Integer>hs2=new HashMap<>();
//         for(int i=0;i<nums1.length;i++){
//             hs1.put(nums1[i],hs1.getOrDefault(nums1[i],0)+1);
//         }
//         for(int i=0;i<nums2.length;i++){
//             hs2.put(nums2[i],hs2.getOrDefault(nums2[i],0)+1);
//         }
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int key:hs1.keySet()){
//             if(hs2.containsKey(key)){
//                 list.add(key);
//             }
//         }
//         int result[]=new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             result[i]=list.get(i);
//         }
//         return result;
//     }
// }