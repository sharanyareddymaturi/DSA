class Solution {
    public int maxDistance(int[] arr) {
        int n=arr.length;
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }
            else{
                int dis=i-hm.get(arr[i]);
                res=Math.max(res,dis);
            }
        }
        return res;
    }
}