
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> arr1=new ArrayList<>();
       int sum=0;
       int start=0;
       for(int end=0;end<arr.length;end++){
           sum+=arr[end];
           
           while(sum>target && start<=end){
               sum-=arr[start];
               start++;
           }
       if(sum==target){
           arr1.add(start+1);
           arr1.add(end+1);
           return arr1;
       }
       }
       arr1.add(-1);
       return arr1;
    }
}
