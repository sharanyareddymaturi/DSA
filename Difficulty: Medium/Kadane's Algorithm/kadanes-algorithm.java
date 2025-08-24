// class Solution {
//     int maxSubarraySum(int[] arr) {
//         int sum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 int temp=0;
//                 for(int k=i;k<=j;k++){
//                     temp+=arr[k];
//                 }
//                 sum=Math.max(sum,temp);
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    int maxSubarraySum(int[] arr) {
        int cur_sum=arr[0];
        int max_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            cur_sum=Math.max(arr[i],cur_sum+arr[i]);
            max_sum=Math.max(max_sum,cur_sum);
        }
        return max_sum;
    }
}
