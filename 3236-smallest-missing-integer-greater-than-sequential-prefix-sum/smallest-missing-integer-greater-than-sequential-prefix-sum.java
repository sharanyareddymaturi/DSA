// class Solution {
//     public int missingInteger(int[] nums) {
//         int n=nums.length;
//         ArrayList<Integer>arr=new ArrayList<>();
//         for(int num:nums){
//             arr.add(num);
//         }
//         ArrayList<Integer>sequential=new ArrayList<>();
//         sequential.add(arr.get(0));
//         for(int i=0;i<n-1;i++){
//             if(arr.get(i)+1 == arr.get(i+1)){
//                 sequential.add(arr.get(i+1));
//             }else{
//                 break;
//             }
//         }
//         int sum1=0;
//         for(int sum:sequential){
//             sum1+=sum;
//         }
//         HashSet<Integer>hs=new HashSet<>(arr);
//         int ans=sum1;
//         while(hs.contains(ans)){
//            ans++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1 == nums[i]){
                sum+=nums[i];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(sum==nums[i]){
                sum++;
            }
        }
        return sum;
    }
}