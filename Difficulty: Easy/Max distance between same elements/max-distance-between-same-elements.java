class Solution {
    public int maxDistance(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }
            else{
                int diff=i-hm.get(arr[i]);
                ans=Math.max(ans,diff);
            }
        }
        return ans;
    }
}




// time limit exceeds

// class Solution {
//     public int maxDistance(int[] arr) {
//         int ans=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             int dis=0;
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     dis=j-i;
//                     ans=Math.max(ans,dis);
//                 }
//             }
//         }
//         return ans;
//     }
// }